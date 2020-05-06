package com.yuqilin.apidemo.bean;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SupplierBean {

    /**
     * supplier : {"name":"SupplierA","unified":"Y","unifyCode":"91370602MA3D7YCH0C","aptitudeUrl1":"https://aliyuncs.com/user_upload/rc-upload-1548056744938-8.png"}
     * refunds : [{"uuid":"DEDFEC9B95694BD790746441B134FAEB","supplier":"C1A19FD42EB24F5E834057F9E9D82166","type":"REFUND"}}]
     * contacts : [{"uuid":"1A36D535C9364652A0BAF3AE306C7B24","supplier":"C1A19FD42EB24F5E834057F9E9D82166","name":"售后","type":"EMPLOYEE","role":"AFTERSALE","phone1":"18512341234"}}]
     */

    private Supplier supplier;
    private List<RefundsBean> refunds;
    private List<ContactsBean> contacts;

    @Data
    @Builder
    public static class Supplier {
        /**
         * name : 倾心墨染
         * unified : Y
         * unifyCode : 91370602MA3D7YCH0C
         * aptitudeUrl1 : https://gxm-ecommerce.oss-cn-shenzhen.aliyuncs.com/user_upload/rc-upload-1548056744938-8.png
         */

        private String name;
        private String unified;
        private String unifyCode;
        private String aptitudeUrl1;
    }

    @Data
    @Builder
    public static class RefundsBean {
        /**
         * uuid : DEDFEC9B95694BD790746441B134FAEB
         * supplier : C1A19FD42EB24F5E834057F9E9D82166
         * type : REFUND
         */

        private String uuid;
        private String supplier;
        private String type;
    }

    @Data
    @Builder
    public static class ContactsBean {
        /**
         * uuid : 1A36D535C9364652A0BAF3AE306C7B24
         * supplier : C1A19FD42EB24F5E834057F9E9D82166
         * name : 售后
         * type : EMPLOYEE
         * role : AFTERSALE
         * phone1 : 18512341234
         */

        private String uuid;
        private String supplier;
        private String name;
        private String type;
        private String role;
        private String phone1;
    }
}
