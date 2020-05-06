package com.yuqilin.apidemo.suite;

import com.alibaba.fastjson.JSON;
import com.yuqilin.apidemo.bean.SupplierBean;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DemoTest extends AbstractTestNGSpringContextTests {

    @Test
    public void test(){
        SupplierBean.Supplier supplier = SupplierBean.Supplier.builder().unifyCode("91370602MA3D7YCH0C").unified("Y").name("SupplierA").aptitudeUrl1("https://aliyuncs.com/user_upload/rc-upload-1548056744938-8.png").build();
        SupplierBean.RefundsBean refundsBean = SupplierBean.RefundsBean.builder().supplier("C1A19FD42EB24F5E834057F9E9D82166").type("REFUND").uuid("DEDFEC9B95694BD790746441B134FAEB").build();
        SupplierBean.ContactsBean contactsBean = SupplierBean.ContactsBean.builder().name("售后").phone1("18512341234").role("AFTERSALE").supplier("C1A19FD42EB24F5E834057F9E9D82166").type("EMPLOYEE").uuid("1A36D535C9364652A0BAF3AE306C7B24").build();
        List refundsBeans = new ArrayList();
        refundsBeans.add(refundsBean);
        List contactsBeans = new ArrayList();
        contactsBeans.add(contactsBean);
        SupplierBean supplierBean = SupplierBean.builder().supplier(supplier).contacts(contactsBeans).refunds(refundsBeans).build();
        System.out.println(supplierBean);
        System.out.println(JSON.toJSONString(supplierBean));
    }
}
