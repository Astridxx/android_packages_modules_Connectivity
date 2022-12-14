/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.libraries.testing.deviceshadower.helpers.nfc;

import android.app.Activity;

/**
 * Activity that triggers or receives NFC events.
 */
public class NfcActivity extends Activity {

    private NfcReceiver.Callback mCallback;

    public void setCallback(NfcReceiver.Callback callback) {
        this.mCallback = callback;
    }

    @Override
    public void onResume() {
        super.onResume();
        NfcReceiver.processIntent(mCallback, getIntent());
    }
}
