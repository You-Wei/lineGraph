package com.example.yyerg.hrv;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;

/**
 * Created by yyerg on 2016/4/25.
 */
public class BLEManager {

    public static String HEART_RATE_MEASUREMENT = "00002a37";

    private BluetoothManager mbluetoothManager;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothGatt mBluetoothGatt;
    private Integer mConnectionState;
    private final Integer REQUEST_ENABLE_BT = 1;
    private static final long SCAN_PERIOD = 10000;
    private boolean mScanning;
    private boolean mConnected;


}
