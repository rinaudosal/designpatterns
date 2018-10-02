package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory;
import io.swagger.annotations.ApiParam;
import io.swagger.model.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-25T08:34:40.705Z")

@Controller
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private Map<Long, Long> otpMap = new HashMap<>();

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EnrollSuspendedOUT> enrollSuspendedUsingGET(@ApiParam(value = "requestId", required = true) @PathVariable("requestId") String requestId, @ApiParam(value = "holderId", required = true) @PathVariable("holderId") Integer holderId, @ApiParam(value = "otpCode", required = true) @PathVariable("otpCode") String otpCode) {
        try {
            long x = 1234567L;
            long y = 23456789L;
            Random r = new Random();
            Long otpId = x + ((long) (r.nextDouble() * (y - x)));

            byte[] bytes = IOUtils.toByteArray(new ClassPathResource("/documentContract.pdf").getInputStream());

            EnrollSuspendedOUT enrollSuspendedOUT = new EnrollSuspendedOUT();
            enrollSuspendedOUT.setCertificateMimeType("application/pdf");
            enrollSuspendedOUT.setDeviceNumber("1234");
            enrollSuspendedOUT.setOtpId(otpId.intValue());
            enrollSuspendedOUT.setEnrolledCertificate(Base64.encodeBase64String(bytes));

            if ("ALWAYS_VALID".equals(otpCode) || "111111".equals(otpCode)) {
                return new ResponseEntity<EnrollSuspendedOUT>(enrollSuspendedOUT, HttpStatus.OK);
            } else if (otpMap.containsKey(holderId.longValue()) && otpMap.get(holderId.longValue()).toString().equals(otpCode)) {
                return new ResponseEntity<EnrollSuspendedOUT>(enrollSuspendedOUT, HttpStatus.OK);
            } else {
                throw new RuntimeException("Wrong otp");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public ResponseEntity<ContractOUT> getContractUsingPOST(@ApiParam(value = "contractIN", required = true) @Valid @RequestBody ContractIN contractIN) {

        try {
            byte[] bytes = IOUtils.toByteArray(new ClassPathResource("/documentContract.pdf").getInputStream());

            ContractOUT contractOUT = new ContractOUT();
            contractOUT.setByteContract(Base64.encodeBase64String(bytes));
            contractOUT.setMimeTypeContract("application/pdf");

            return new ResponseEntity<ContractOUT>(contractOUT, HttpStatus.OK);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<ContractOUT>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<OtpRequestWithCustomerOUT> otpRequestUsingPOST(@ApiParam(value = "otpRequestWithCustomerIN", required = true) @Valid @RequestBody OtpRequestWithCustomerIN otpRequestWithCustomerIN) {
        try {

            long x = 1234567L;
            long y = 23456789L;
            Random r = new Random();
            long holder = null == otpRequestWithCustomerIN.getHolderId() ? x + ((long) (r.nextDouble() * (y - x))) : otpRequestWithCustomerIN.getHolderId();
            long otp = x + ((long) (r.nextDouble() * (y - x)));

            otpMap.put(holder, otp);

            SlackSession session = SlackSessionFactory.createWebSocketSlackSession("xoxp-386819753813-387726676423-385984789744-02070eebc26b122225a9a40254725a56");
            session.connect();
            SlackChannel channel = session.findChannelByName("general"); //make sure bot is a member of the channel.

            session.sendMessage(channel, "namirial-mock request otp -> [SMS]->[" + otpRequestWithCustomerIN.getPhoneMobile() + "]: " + otpRequestWithCustomerIN.getTextMessage() + otp);

            return new ResponseEntity<OtpRequestWithCustomerOUT>(objectMapper.readValue("{  \"requestId\" : \"RECN" + System.currentTimeMillis() + "\",  \"holderId\" : " + holder + "}", OtpRequestWithCustomerOUT.class), HttpStatus.OK);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<OtpRequestWithCustomerOUT>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Void> sendOtpSmsFromHolderUsingPOST(@ApiParam(value = "sendOtpSmsFromHolderIN", required = true) @Valid @RequestBody SendOtpSmsFromHolderIN sendOtpSmsFromHolderIN) {
        SlackSession session = SlackSessionFactory.createWebSocketSlackSession("xoxp-386819753813-387726676423-385984789744-02070eebc26b122225a9a40254725a56");
        try {
            session.connect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        long x = 1234567L;
        long y = 23456789L;
        Random r = new Random();

        long otp = x + ((long) (r.nextDouble() * (y - x)));

        otpMap.put(sendOtpSmsFromHolderIN.getHolderId().longValue(), otp);

        SlackChannel channel = session.findChannelByName("general"); //make sure bot is a member of the channel.

        session.sendMessage(channel, "namirial-mock resend otp-> [SMS]->[" + sendOtpSmsFromHolderIN.getHolderId() + "]: " + sendOtpSmsFromHolderIN.getTextMessage() + otp);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
