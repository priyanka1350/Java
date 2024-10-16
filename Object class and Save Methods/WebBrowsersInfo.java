public class WebBrowsersInfo {

    static Browser[] browserData = new Browser[8];

    public static void main(String[] args){
        Browser browser = new Browser("Google Chrome", 118.0 ,0.85 , 300 , 0.5 ); 
        Browser browser1 = new Browser("Mozilla Firefox",119.0 ,0.80, 300 ,0.9 ); 
        Browser browser2= new Browser("Microsoft Edge",118.0 ,0.90, 350 ,0.7 ); 
        Browser browser3= new Browser("Safari",16.5 ,0.88, 250 ,0.8 ); 
        Browser browser4= new Browser("Opera",102.0,0.78, 300 ,0.6 ); 
        Browser browser5= new Browser("Brave", 1.46 ,0.92, 250 ,0.10 ); 
        Browser browser6= new Browser("Vivaldi",6.4 ,0.75, 300 ,0.8 ); 
        Browser browser7= new Browser("Tor Browser",12.5, 0.30, 200 ,0.10 ); 

        saveBrowser(browser);
        saveBrowser(browser1);
        saveBrowser(browser2);
        saveBrowser(browser3);
        saveBrowser(browser4);
        saveBrowser(browser5);
        saveBrowser(browser6);
        saveBrowser(browser7);

        //displayBrowsers();
for (int i=0; i<browserData.length; i++){
    if(browserData[i]!=null){
        browserData[i].BrowserInfo();
        System.out.println();
    }
}

    }
    public static boolean saveBrowser(Browser browser){
        for(int i=0; i<browserData.length; i++  ){
            if(browserData[i] == null ){
                browserData[i] = browser;
                
                System.out.println("Browser is Saved");
                
                return true;
                
            }
        }
        System.out.println("No Space in the array");
        
        return false;
        
    }
    
    
}
