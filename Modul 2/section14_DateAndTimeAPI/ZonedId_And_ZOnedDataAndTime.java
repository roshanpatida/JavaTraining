/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section14_DateAndTimeAPI;

import java.time.ZoneId;

/**
 *
 * @author roshan_patidar
 */
public class ZonedId_And_ZOnedDataAndTime {
    public static void main(String[] args) {
        ZoneId zone=ZoneId.systemDefault();
        System.out.println(zone);
        ZoneId la = ZoneId.of("America/los_Angeles");
        ZoneDateTime zt=ZoneDateTime.now(la);
      
        System.out.println(zt);
    }
}
