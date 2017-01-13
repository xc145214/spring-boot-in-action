/**
 * **********************************************************************
 * HONGLING CAPITAL CONFIDENTIAL AND PROPRIETARY
 * <p>
 * COPYRIGHT (C) HONGLING CAPITAL CORPORATION 2012
 * ALL RIGHTS RESERVED BY HONGLING CAPITAL CORPORATION. THIS PROGRAM
 * MUST BE USED  SOLELY FOR THE PURPOSE FOR WHICH IT WAS FURNISHED BY
 * HONGLING CAPITAL CORPORATION. NO PART OF THIS PROGRAM MAY BE REPRODUCED
 * OR DISCLOSED TO OTHERS,IN ANY FORM, WITHOUT THE PRIOR WRITTEN
 * PERMISSION OF HONGLING CAPITAL CORPORATION. USE OF COPYRIGHT NOTICE
 * DOES NOT EVIDENCE PUBLICATION OF THE PROGRAM.
 * HONGLING CAPITAL CONFIDENTIAL AND PROPRIETARY
 * ***********************************************************************
 */
package com.xc.controller;

import com.xc.domian.People;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *  @author xiachuan at 2017/1/13 16:07。
 */

@Controller
public class PeropleController {

    @RequestMapping("/")
    public String index(Model model){

        People single = new People("aa",11);

        List<People> peoples = new ArrayList<>();
        People p1 = new People("xx",11);
        People p2 = new People("yy",22);
        People p3 = new People("zz",33);

        peoples.add(p1);
        peoples.add(p2);
        peoples.add(p3);

        model.addAttribute("singlePerson",single);
        model.addAttribute("people",peoples);
        return "index";
    }
}

