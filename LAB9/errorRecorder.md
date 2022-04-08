\*หมายเหตุ 1
-ต้องมีการลง open javafx JDK ใน referenced library ก่อนการใช้งาน (Path ไม่ควรมี ภาษาไทย!)

\*หมายเหตุ 2
-ถ้ามีการเปลี่ยน path ของ src ต้องมีการเพิ่ม vmArgs ลงไปใน launch.json ที่ launch path ใหม่ทุกครั้ง
,"vmArgs": "--module-path C:/javafx-sdk-17.0.2/lib --add-modules javafx.controls,javafx.fxml" (เปลี่ยน path ด้วย)

---

## ERROR RECORDER AND HOW TO SOLVE THEM

## ถ้าเกิด Error :

Error: Could not find or load main class (ชื่อไฟล์ของคุณ.App)
Caused by: java.lang.NoClassDefFoundError: javafx/application/Application

ปัญหาของมันคือ

ตอนเราลง javafx library หรือ create new project แล้ว Directory Path (เช็คใน setting.json) มันเจอภาษาไทยเลยบึ้ม เช่น Path เป็น เดสก์ท๊อป (Java ไม่ถูกกับภาษาไทย)

## วิธีแก้ง่ายๆ ย้ายทั้งหมด(สร้างใหม่) ไปไว้ใน C:/ (OS c:/)

---

## ถ้าเกิด Error :

JavaFX runtime components are missing, and are required to run this application (launch.json ยังไม่ได้ใส่ vmArgs)

## วิธีแก้คือ ต้องเพิ่ม ,"vmArgs": "--module-path C:/javafx-sdk-17.0.2/lib --add-modules javafx.controls,javafx.fxml" (เปลี่ยน path ด้วย)

---

## ถ้าเกิด Error :

Exception in Application start method
java.lang.reflect.InvocationTargetException
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.base/java.lang.reflect.Method.invoke(Method.java:568)
at javafx.graphics/com.sun.javafx.application.LauncherImpl.launchApplicationWithArgs(LauncherImpl.java:465)
at javafx.graphics/com.sun.javafx.application.LauncherImpl.launchApplication(LauncherImpl.java:364)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.base/java.lang.reflect.Method.invoke(Method.java:568)
at java.base/sun.launcher.LauncherHelper$FXHelper.main(LauncherHelper.java:1071)
Caused by: java.lang.RuntimeException: Exception in Application start method
        at javafx.graphics/com.sun.javafx.application.LauncherImpl.launchApplication1(LauncherImpl.java:901)
        at javafx.graphics/com.sun.javafx.application.LauncherImpl.lambda$launchApplication$2(LauncherImpl.java:196)
        at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: java.lang.IllegalArgumentException: Invalid URL: Invalid URL or resource not found
        at javafx.graphics/javafx.scene.image.Image.validateUrl(Image.java:1135)
        at javafx.graphics/javafx.scene.image.Image.<init>(Image.java:625)
        at Pro2.App.start(App.java:16)
        at javafx.graphics/com.sun.javafx.application.LauncherImpl.lambda$launchApplication1$9(LauncherImpl.java:847)
        at javafx.graphics/com.sun.javafx.application.PlatformImpl.lambda$runAndWait$12(PlatformImpl.java:484)
        at javafx.graphics/com.sun.javafx.application.PlatformImpl.lambda$runLater$10(PlatformImpl.java:457)
        at java.base/java.security.AccessController.doPrivileged(AccessController.java:399)
        at javafx.graphics/com.sun.javafx.application.PlatformImpl.lambda$runLater$11(PlatformImpl.java:456)
        at javafx.graphics/com.sun.glass.ui.InvokeLaterDispatcher$Future.run(InvokeLaterDispatcher.java:96)
at javafx.graphics/com.sun.glass.ui.win.WinApplication.\_runLoop(Native Method)
at javafx.graphics/com.sun.glass.ui.win.WinApplication.lambda$runLoop$3(WinApplication.java:184)
... 1 more
at javafx.graphics/javafx.scene.image.Image.validateUrl(Image.java:1120)
... 11 more

(image path incorrect!)

## วิธีแก้คือ เปลี่ยน path ของรูปภาพให้ถูกต้อง

## ถ้าเกิด Error :

Error occurred during initialization of boot layer 
java.lang.module.FindException: Module javafx.controls not found

## วิธีแก้คือ ต้องเพิ่ม ,"vmArgs": "--module-path C:/javafx-sdk-17.0.2/lib --add-modules javafx.controls,javafx.fxml" (เปลี่ยน path ให้ถูกด้วย)