package com.M3ssa10.miapp;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;
import com.getcapacitor.PluginManager;

public class MainActivity extends BridgeActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Registrar plugin SIN referenciar la clase (evita problema Java->Kotlin)
    PluginManager.addPluginClass(com.M3ssa10.miapp.FolderTxtReaderPlugin.class);
  }
}

