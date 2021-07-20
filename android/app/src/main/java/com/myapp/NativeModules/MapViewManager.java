package com.myapp.NativeModules;

import com.tomtom.online.sdk.map.MapView;
import android.view.View;
import android.widget.TextView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import javax.annotation.Nonnull;

public class MapViewManager extends SimpleViewManager<View> {
    @Nonnull
    @Override
    public String getName() {
        return "MapViewManager";
    }

    @Nonnull
    @Override
    protected View createViewInstance(@Nonnull ThemedReactContext reactContext) {
        MapView mapView = new MapView(reactContext);
        return  mapView;
    }
}