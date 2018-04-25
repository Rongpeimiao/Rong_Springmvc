package com.rong.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * @author rong  
 * @describe: springmvc������
 */
@Controller  //ע��Ϊ������
@RequestMapping(value="/")    //�ػ�����·��������
public class HelloController {
    @RequestMapping(value="/hello")   //������·�ɵ���Ӧ�ķ�����
    public String Hello(Model model){//model������������
        model.addAttribute("messa", "Hello rong");
        return "hello";//·�ɵ�һ��ҳ�棬������hello.jsp
    }
}
