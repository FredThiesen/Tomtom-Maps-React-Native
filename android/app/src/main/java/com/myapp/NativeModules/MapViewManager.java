package com.myapp.NativeModules;


import android.content.Context;
import androidx.annotation.NonNull;
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
        TomTomMap tomTomMap = new TomTomMap(reactContext);
        tomTomMap.onResume();
        return tomTomMap;
    }
}