import { NgModule } from '@angular/core';

import { RetrospectiveSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [RetrospectiveSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [RetrospectiveSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class RetrospectiveSharedCommonModule {}
