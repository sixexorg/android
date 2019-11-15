package com.exechangeproject;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.AlexanderZaytsev.RNI18n.RNI18nPackage;
import com.github.yamill.orientation.OrientationPackage;
import com.reactnativecommunity.netinfo.NetInfoPackage;
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage;
import com.imagepicker.ImagePickerPackage;
import com.lewin.qrcode.QRScanReaderPackage;
import org.reactnative.camera.RNCameraPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import fr.bamlab.rncameraroll.CameraRollPackage;
import fr.greweb.reactnativeviewshot.RNViewShotPackage;
import com.horcrux.svg.SvgPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new RNI18nPackage(),
            new OrientationPackage(),
            new NetInfoPackage(),
            new AsyncStoragePackage(),
            new ImagePickerPackage(),
            new QRScanReaderPackage(),
            new RNCameraPackage(),
            new LinearGradientPackage(),
            new RNCWebViewPackage(),
            new CameraRollPackage(),
            new RNViewShotPackage(),
            new SvgPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }

    @Override protected String getBundleAssetName() { return "index.android.bundle"; }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}