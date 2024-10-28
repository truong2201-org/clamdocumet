package vn.com.t3h.controller.cms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//giup tu dong tao bean ( khoi tao doi tuong bang tu khoa new)
@Controller
public class HomeGuestcontroller {

    /** @GetMapping : chi dinh voi duong dan localhost:8080/home-guest
     * se duoc controller HomeController tiep nhan va chi dinh ham home guest nay
     * xu li va tiep nhan request
     * value=: khai bao duong dan de chi dinh ung voi duong dan do se la ham
     * homguest tiep nhan request va xu li

     */
    @GetMapping(value = "/home")
    public String homeGuest() {
        //tra ve duong dan den ten file html laf page tra ve cho font-end
        // duong dan tinh tu thu muc temple tro di

        return "homeguest";
    }
}
