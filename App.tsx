import React from 'react';
import {View, requireNativeComponent, StyleSheet, Alert} from 'react-native';

const TomTomMap = requireNativeComponent('MapViewManager');

const App = () => {
  return (
    <>
      <TomTomMap
        onMapReady={this.onMapReady}
        markers={[
          {lat: -29.572263, lng: -50.793078, label: 'Igrejinha'},
          {lat: -29.64985, lng: -50.781169, label: 'Taquara'},
        ]}
        mapZoom={15}
        mapCenter={{lat: -29.572263, lng: -50.793078}}
        style={StyleSheet.absoluteFillObject}
      />
    </>
  );
};

export default App;
