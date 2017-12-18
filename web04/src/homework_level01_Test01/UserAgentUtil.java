package homework_level01_Test01;

import org.apache.commons.lang3.StringUtils;

/** 
 * 鏍规嵁 user agent string 鍒ゆ柇鐢ㄦ埛鐨勫钩鍙般�娴忚鍣�
 * ************************************************************************************************************************************************** 
 *  
 * 鍙板紡鏈�
 *  
 * Linux Ubuntu 
 * Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.2.2pre) Gecko/20100225 Ubuntu/9.10 (karmic) Namoroka/3.6.2pre 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * Linux Mandriva 2008.1 
 * Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.1) Gecko/2008072403 Mandriva/3.0.1-1mdv2008.1 (2008.1) Firefox/3.0.1 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * Linux suSE 10.1 
 * Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.0.3) Gecko/20060425 SUSE/1.5.0.3-7 Firefox/1.5.0.31 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * Windows XP SP3 
 * Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.1) Gecko/20090624 Firefox/3.5 (.NET CLR 3.5.30729) 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * Windows Vista 
 * Mozilla/5.0 (Windows; U; Windows NT 6.1; nl; rv:1.9.2.13) Gecko/20101203 Firefox/3.6.13 
 * Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.2.6) Gecko/20100625 Firefox/3.6.6 (.NET CLR 3.5.30729) 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * windows 2000 
 * Mozilla/5.0 (Windows; U; Windows NT 5.0; en-GB; rv:1.8.1b2) Gecko/20060821 Firefox/2.0b2 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * Windows 7 
 * Mozilla/5.0 (Windows NT 6.1; WOW64; rv:14.0) Gecko/20100101 Firefox/14.0.1 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * Windows Server 2008 
 * Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.1.5) Gecko/20091102 Firefox/3.5.5 (.NET CLR 3.5.30729) 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * iMac OSX 10.7.4 
 * Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:13.0) Gecko/20100101 Firefox/13.0.1 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * Mac OS X 
 * Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.6; en-US; rv:1.9.2.9) Gecko/20100824 Firefox/3.6.9 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 *  
 * 鎵嬫寔璁惧 
 *  
 * iPad 
 * Mozilla/5.0 (iPad; U; CPU OS 3_2 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Version/4.0.4 Mobile/7B334b Safari/531.21.10 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * iPad 2 
 * Mozilla/5.0 (iPad; CPU OS 5_1 like Mac OS X; en-us) AppleWebKit/534.46 (KHTML, like Gecko) Version/5.1 Mobile/9B176 Safari/7534.48.3 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * iPhone 4 
 * Mozilla/5.0 (iPhone; U; CPU iPhone OS 4_0 like Mac OS X; en-us) AppleWebKit/532.9 (KHTML, like Gecko) Version/4.0.5 Mobile/8A293 Safari/6531.22.7 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * iPhone 5 
 * Mozilla/5.0 (iPhone; CPU iPhone OS 5_0 like Mac OS X) AppleWebKit/534.46 (KHTML, like Gecko) Version/5.1 Mobile/9A334 Safari/7534.48.3 
 * -------------------------------------------------------------------------------------------------------------------------------------------------- 
 * Android 
 * Mozilla/5.0 (Linux; U; Android 2.2; en-us; Nexus One Build/FRF91) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1 
 * ************************************************************************************************************************************************** 
 * @author Defonds 
 */  
public class UserAgentUtil {  
  
    /** 
     * 鐢ㄩ�锛氭牴鎹鎴风 User Agent Strings 鍒ゆ柇鍏舵祻瑙堝櫒銆佹搷浣滃钩鍙�
     * if 鍒ゆ柇鐨勫厛鍚庢搴忥細 
     * 鏍规嵁璁惧鐨勭敤鎴蜂娇鐢ㄩ噺闄嶅簭鎺掑垪锛岃繖鏍峰浜庡ぇ澶氭暟鐢ㄦ埛鏉ヨ鍙互灏戝垽鏂嚑娆″嵆鍙嬁鍒扮粨鏋滐細 
     *  >>鎿嶄綔绯荤粺:Windows > 鑻规灉 > 瀹夊崜 > Linux > ... 
     *  >>Browser:Chrome > FF > IE > ... 
     * @param userAgentStr 
     * @return 
     */  
    public static UserAgent getUserAgent(String userAgent) {  
        if (StringUtils.isBlank(userAgent)) {  
            return null;  
        }   
          
        if (userAgent.contains("Windows")) {//涓绘祦搴旂敤闈犲墠  
            /** 
             * ****************** 
             * 鍙板紡鏈�Windows 绯诲垪 
             * ****************** 
             * Windows NT 6.2   -   Windows 8 
             * Windows NT 6.1   -   Windows 7 
             * Windows NT 6.0   -   Windows Vista 
             * Windows NT 5.2   -   Windows Server 2003; Windows XP x64 Edition 
             * Windows NT 5.1   -   Windows XP 
             * Windows NT 5.01  -   Windows 2000, Service Pack 1 (SP1) 
             * Windows NT 5.0   -   Windows 2000 
             * Windows NT 4.0   -   Microsoft Windows NT 4.0 
             * Windows 98; Win 9x 4.90  -   Windows Millennium Edition (Windows Me) 
             * Windows 98   -   Windows 98 
             * Windows 95   -   Windows 95 
             * Windows CE   -   Windows CE 
             * 鍒ゆ柇渚濇嵁:http://msdn.microsoft.com/en-us/library/ms537503(v=vs.85).aspx 
             */  
            if (userAgent.contains("Windows NT 6.2")) {//Windows 8  
                return judgeBrowser(userAgent, "Windows", "8" , null);//鍒ゆ柇娴忚鍣� 
            } else if (userAgent.contains("Windows NT 6.1")) {//Windows 7  
                return judgeBrowser(userAgent, "Windows", "7" , null);  
            } else if (userAgent.contains("Windows NT 6.0")) {//Windows Vista  
                return judgeBrowser(userAgent, "Windows", "Vista" , null);  
            } else if (userAgent.contains("Windows NT 5.2")) {//Windows XP x64 Edition  
                return judgeBrowser(userAgent, "Windows", "XP" , "x64 Edition");  
            } else if (userAgent.contains("Windows NT 5.1")) {//Windows XP  
                return judgeBrowser(userAgent, "Windows", "XP" , null);  
            } else if (userAgent.contains("Windows NT 5.01")) {//Windows 2000, Service Pack 1 (SP1)  
                return judgeBrowser(userAgent, "Windows", "2000" , "SP1");  
            } else if (userAgent.contains("Windows NT 5.0")) {//Windows 2000  
                return judgeBrowser(userAgent, "Windows", "2000" , null);  
            } else if (userAgent.contains("Windows NT 4.0")) {//Microsoft Windows NT 4.0  
                return judgeBrowser(userAgent, "Windows", "NT 4.0" , null);  
            } else if (userAgent.contains("Windows 98; Win 9x 4.90")) {//Windows Millennium Edition (Windows Me)  
                return judgeBrowser(userAgent, "Windows", "ME" , null);  
            } else if (userAgent.contains("Windows 98")) {//Windows 98  
                return judgeBrowser(userAgent, "Windows", "98" , null);  
            } else if (userAgent.contains("Windows 95")) {//Windows 95  
                return judgeBrowser(userAgent, "Windows", "95" , null);  
            } else if (userAgent.contains("Windows CE")) {//Windows CE  
                return judgeBrowser(userAgent, "Windows", "CE" , null);  
            }   
        } else if (userAgent.contains("Mac OS X")) {  
            /** 
             * ******** 
             * 鑻规灉绯诲垪 
             * ******** 
             * iPod -       Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_1 like Mac OS X; zh-cn) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8G4 Safari/6533.18.5 
             * iPad -       Mozilla/5.0 (iPad; U; CPU OS 3_2 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Version/4.0.4 Mobile/7B334b Safari/531.21.10 
             * iPad2    -       Mozilla/5.0 (iPad; CPU OS 5_1 like Mac OS X; en-us) AppleWebKit/534.46 (KHTML, like Gecko) Version/5.1 Mobile/9B176 Safari/7534.48.3 
             * iPhone 4 -   Mozilla/5.0 (iPhone; U; CPU iPhone OS 4_0 like Mac OS X; en-us) AppleWebKit/532.9 (KHTML, like Gecko) Version/4.0.5 Mobile/8A293 Safari/6531.22.7 
             * iPhone 5 -   Mozilla/5.0 (iPhone; CPU iPhone OS 5_0 like Mac OS X) AppleWebKit/534.46 (KHTML, like Gecko) Version/5.1 Mobile/9A334 Safari/7534.48.3 
             * 鍒ゆ柇渚濇嵁:http://www.useragentstring.com/pages/Safari/ 
             * 鍙傝�:http://stackoverflow.com/questions/7825873/what-is-the-ios-5-0-user-agent-string 
             * 鍙傝�:http://stackoverflow.com/questions/3105555/what-is-the-iphone-4-user-agent 
             */  
            if (userAgent.contains("iPod")) {  
                return judgeBrowser(userAgent, "iPod", null , null);//鍒ゆ柇娴忚鍣� 
            }  
        }  
        return null;  
    }  
      
    /** 
     * 鐢ㄩ�锛氭牴鎹鎴风 User Agent Strings 鍒ゆ柇鍏舵祻瑙堝櫒 
     * if 鍒ゆ柇鐨勫厛鍚庢搴忥細 
     * 鏍规嵁娴忚鍣ㄧ殑鐢ㄦ埛浣跨敤閲忛檷搴忔帓鍒楋紝杩欐牱瀵逛簬澶у鏁扮敤鎴锋潵璇村彲浠ュ皯鍒ゆ柇鍑犳鍗冲彲鎷垮埌缁撴灉锛�
     *  >>Browser:Chrome > FF > IE > ... 
     * @param userAgent:user agent 
     * @param platformType:骞冲彴 
     * @param platformSeries:绯诲垪 
     * @param platformVersion:鐗堟湰 
     * @return 
     */  
    private static UserAgent judgeBrowser(String userAgent, String platformType, String platformSeries, String platformVersion) {  
        if (userAgent.contains("Chrome")) {  
            /** 
             * *********** 
             * Chrome 绯诲垪 
             * *********** 
             * Chrome 24.0.1295.0   -   Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.15 (KHTML, like Gecko) Chrome/24.0.1295.0 Safari/537.15 
             * Chrome 24.0.1292.0   -   Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.14 (KHTML, like Gecko) Chrome/24.0.1292.0 Safari/537.14 
             * Chrome 24.0.1290.1   -   Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_2) AppleWebKit/537.13 (KHTML, like Gecko) Chrome/24.0.1290.1 Safari/537.13 
             * 鍒ゆ柇渚濇嵁:http://www.useragentstring.com/pages/Chrome/ 
             */  
            String temp = userAgent.substring(userAgent.indexOf("Chrome/") + 7);//鎷垮埌User Agent String "Chrome/" 涔嬪悗鐨勫瓧绗︿覆,缁撴灉褰㈠"24.0.1295.0 Safari/537.15"鎴�24.0.1295.0"  
            String chromeVersion = null;  
            if (temp.indexOf(" ") < 0) {//temp褰㈠"24.0.1295.0"  
                chromeVersion = temp;  
            } else {//temp褰㈠"24.0.1295.0 Safari/537.15"  
                chromeVersion = temp.substring(0, temp.indexOf(" "));  
            }  
            return new UserAgent("Chrome", chromeVersion, platformType, platformSeries, platformVersion);  
        } else if (userAgent.contains("Firefox")) {  
            /** 
             * ******* 
             * FF 绯诲垪 
             * ******* 
             * Firefox 16.0.1   -   Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:16.0.1) Gecko/20121011 Firefox/16.0.1 
             * Firefox 15.0a2   -   Mozilla/5.0 (Windows NT 6.1; rv:15.0) Gecko/20120716 Firefox/15.0a2 
             * Firefox 15.0.2   -   Mozilla/5.0 (Windows NT 6.2; WOW64; rv:15.0) Gecko/20120910144328 Firefox/15.0.2 
             * 鍒ゆ柇渚濇嵁:http://www.useragentstring.com/pages/Firefox/ 
             */  
            String temp = userAgent.substring(userAgent.indexOf("Firefox/") + 8);//鎷垮埌User Agent String "Firefox/" 涔嬪悗鐨勫瓧绗︿覆,缁撴灉褰㈠"16.0.1 Gecko/20121011"鎴�16.0.1"  
            String ffVersion = null;  
            if (temp.indexOf(" ") < 0) {//temp褰㈠"16.0.1"  
                ffVersion = temp;  
            } else {//temp褰㈠"16.0.1 Gecko/20121011"  
                ffVersion = temp.substring(0, temp.indexOf(" "));  
            }  
            return new UserAgent("Firefox", ffVersion, platformType, platformSeries, platformVersion);  
        } else if (userAgent.contains("MSIE")) {  
            /** 
             * ******* 
             * IE 绯诲垪 
             * ******* 
             * MSIE 10.0    -   Internet Explorer 10 
             * MSIE 9.0 -   Internet Explorer 9 
             * MSIE 8.0 -   Internet Explorer 8 or IE8 Compatibility View/Browser Mode 
             * MSIE 7.0 -   Windows Internet Explorer 7 or IE7 Compatibility View/Browser Mode 
             * MSIE 6.0 -   Microsoft Internet Explorer 6 
             * 鍒ゆ柇渚濇嵁:http://msdn.microsoft.com/en-us/library/ms537503(v=vs.85).aspx 
             */  
            if (userAgent.contains("MSIE 10.0")) {//Internet Explorer 10  
                return new UserAgent("Internet Explorer", "10", platformType, platformSeries, platformVersion);  
            } else if (userAgent.contains("MSIE 9.0")) {//Internet Explorer 9  
                return new UserAgent("Internet Explorer", "9", platformType, platformSeries, platformVersion);  
            } else if (userAgent.contains("MSIE 8.0")) {//Internet Explorer 8  
                return new UserAgent("Internet Explorer", "8", platformType, platformSeries, platformVersion);  
            } else if (userAgent.contains("MSIE 7.0")) {//Internet Explorer 7  
                return new UserAgent("Internet Explorer", "7", platformType, platformSeries, platformVersion);  
            } else if (userAgent.contains("MSIE 6.0")) {//Internet Explorer 6  
                return new UserAgent("Internet Explorer", "6", platformType, platformSeries, platformVersion);  
            }  
        } else {//鏆傛椂鏀寔浠ヤ笂涓変釜涓绘祦.鍏跺畠娴忚鍣�寰呯画...  
            return new UserAgent(null, null, platformType, platformSeries, platformVersion);  
        }  
        return null;  
    }  
}  