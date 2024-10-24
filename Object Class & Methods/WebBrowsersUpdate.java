// Source code is decompiled from a .class file using FernFlower decompiler.
public class WebBrowsersUpdate {
   static Browser[] browserData = new Browser[10];

   public WebBrowsersUpdate() {
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
      System.out.println("`````````````````````````````````````````````````");
      Browser var9 = findByName("Mozilla Firefox");
      if (var9 != null) {
         var9.BrowserInfo();
         System.out.println();
      }

      Browser var10 = findByName("Google Chrome");
      if (var10 != null) {
         System.out.println("*******Found browser by Name******");
         var10.BrowserInfo();
         System.out.println();
      }

      updateSpeedByBrowserName("Brave", 0.95);
      updateSpeedByBrowserName("Tor Browser", 0.5);

      for(int var11 = 0; var11 < browserData.length; ++var11) {
         if (browserData[var11] != null) {
            browserData[var11].BrowserInfo();
            System.out.println();
         }
      }

   }

   public static boolean saveBrowser(Browser var0) {
      for(int var1 = 0; var1 < browserData.length; ++var1) {
         if (browserData[var1] == null) {
            browserData[var1] = var0;
            System.out.println("Browser is Saved");
            System.out.println();
            return true;
         }
      }

      System.out.println("No Space in the array");
      System.out.println();
      return false;
   }

   public static Browser findByName(String var0) {
      for(int var1 = 0; var1 < browserData.length; ++var1) {
         if (browserData[var1].browserName.equals(var0)) {
            System.out.println("Browser found");
            System.out.println();
            return browserData[var1];
         }
      }

      System.out.println("Browser Name not found in array");
      System.out.println();
      return null;
   }

   public static boolean updateSpeedByBrowserName(String var0, double var1) {
      for(int var3 = 0; var3 < browserData.length; ++var3) {
         if (browserData[var3] != null) {
            browserData[var3].speed = var1;
            System.out.println("Speed Updated");
            System.out.println();
            return true;
         }
      }

      System.out.println("Browser Name not found,update failed");
      System.out.println("``````````````````````````````````````````");
      return false;
   }
}
