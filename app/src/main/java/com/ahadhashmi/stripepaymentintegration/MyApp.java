package com.ahadhashmi.stripepaymentintegration;

import android.app.Application;
import com.stripe.android.PaymentConfiguration;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PaymentConfiguration.init(
            getApplicationContext(),
            "pk_test_51KDo5yH3RekQhVARBh2YPAp8AalTlGPZNb0dP656xhanagmozA1gx1lXYVsUiCvGtOixeQ1m9g1t5zLqBFjR71s300cWlZTh2N"
        );
    }
}