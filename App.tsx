import React from 'react';
import {View, requireNativeComponent, StyleSheet} from 'react-native';

const TomTomMap = requireNativeComponent('MapViewManager');

const App = () => {
  return (
    <>
      <TomTomMap style={StyleSheet.absoluteFillObject} />
    </>
  );
};

export default App;
