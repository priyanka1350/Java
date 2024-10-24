// Source code is decompiled from a .class file using FernFlower decompiler.
public class WebBrowsersInfo {
   static Browser[] browserData = new Browser[8];

   public WebBrowsersInfo() {
   }

   public static void main(String[] var0) {
      Browser var1 = new Browser("Google Chrome", 118.0, 0.85, 300, 0.5);
      Browser var2 = new Browser("Mozilla Firefox", 119.0, 0.8, 300, 0.9);
      Browser var3 = new Browser("Microsoft Edge", 118.0, 0.9, 350, 0.7);
      Browser var4 = new Browser("Safari", 16.5, 0.88, 250, 0.8);
      Browser var5 = new Browser("Opera", 102.0, 0.78, 300, 0.6);
      Browser var6 = new Browser("Brave", 1.46, 0.92, 250, 0.1);
      Browser var7 = new Browser("Vivaldi", 6.4, 0.75, 300, 0.8);
      Browser var8 = new Browser("Tor Browser", 12.5, 0.3, 200, 0.1);
      saveBrowser(var1);
      saveBrowser(var2);
      saveBrowser(var3);
      saveBrowser(var4);
      saveBrowser(var5);
      saveBrowser(var6);
      saveBrowser(var7);
      saveBrowser(var8);

      for(int var9 = 0; var9 < browserData.length; ++var9) {
         if (browserData[var9] != null) {
            browserData[var9].BrowserInfo();
            System.out.println();
         }
      }

   }

   public static boolean saveBrowser(Browser var0) {
      for(int var1 = 0; var1 < browserData.length; ++var1) {
         if (browserData[var1] == null) {
            browserData[var1] = var0;
            System.out.println("Browser is Saved");
            return true;
         }
      }

      System.out.println("No Space in the array");
      return false;
   }
}
