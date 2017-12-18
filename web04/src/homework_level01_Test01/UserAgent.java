package homework_level01_Test01;
/** 
 * 鏍规嵁 user agent string 鏉ュ垽鏂嚭瀹㈡埛绔殑娴忚鍣ㄤ互鍙婂钩鍙扮瓑淇℃伅 
 * @author Defonds 
 */  
public class UserAgent {  
    private String browserType;//娴忚鍣ㄧ被鍨� 
    private String browserVersion;//娴忚鍣ㄧ増鏈� 
    private String platformType;//骞冲彴绫诲瀷  
    private String platformSeries;//骞冲彴绯诲垪  
    private String platformVersion;//骞冲彴鐗堟湰  
      
    public UserAgent(){}  
      
    public UserAgent(String browserType, String browserVersion,  
            String platformType, String platformSeries, String platformVersion){  
        this.browserType = browserType;  
        this.browserVersion = browserVersion;  
        this.platformType = platformType;  
        this.platformSeries = platformSeries;  
        this.platformVersion = platformVersion;  
    }  
      
    public String getBrowserType() {  
        return browserType;  
    }  
    public void setBrowserType(String browserType) {  
        this.browserType = browserType;  
    }  
    public String getBrowserVersion() {  
        return browserVersion;  
    }  
    public void setBrowserVersion(String browserVersion) {  
        this.browserVersion = browserVersion;  
    }  
    public String getPlatformType() {  
        return platformType;  
    }  
    public void setPlatformType(String platformType) {  
        this.platformType = platformType;  
    }  
    public String getPlatformSeries() {  
        return platformSeries;  
    }  
    public void setPlatformSeries(String platformSeries) {  
        this.platformSeries = platformSeries;  
    }  
    public String getPlatformVersion() {  
        return platformVersion;  
    }  
    public void setPlatformVersion(String platformVersion) {  
        this.platformVersion = platformVersion;  
    }  
      
}  