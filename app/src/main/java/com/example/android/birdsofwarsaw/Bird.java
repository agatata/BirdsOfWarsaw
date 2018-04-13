/*
 * Copyright (C) 2016 The Android Open Source Project
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
 *
 */

package com.example.android.birdsofwarsaw;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * {@link Bird} represents a bird species.
 * It contains a bird species name and place of its common existence.
 * Bird class implements Parcelable.
 */
public class Bird implements Parcelable {

    /**
     * Creator with Bird as its type
     */

    public static final Creator <Bird> CREATOR = new Creator <Bird>() {
        // Method createFromParcel which creates a Bird from the Parcel
        @Override
        public Bird createFromParcel(Parcel in) {
            return new Bird(in);
        }

        @Override
        public Bird[] newArray(int size) {
            return new Bird[size];
        }
    };
    /**
     * Name of the bird species
     */
    private String mBirdName;
    /**
     * Place of species existence
     */
    private String mBirdPlace;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId;

    /**
     * Create a new Bird object.
     *
     * @param birdName        is the name of the bird species
     * @param birdPlace       describes species existence
     * @param imageResourceId is the drawable ID for the image resource
     */
    public Bird(String birdName, String birdPlace, int imageResourceId) {
        mBirdName = birdName;
        mBirdPlace = birdPlace;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Bird object which gets Parcel in
     */

    protected Bird(Parcel in) {
        mBirdName = in.readString();
        mBirdPlace = in.readString();
        mImageResourceId = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Get the species name.
     */
    public String getBirdName() {
        return mBirdName;
    }

    /**
     * Get the existence description.
     */
    public String getBirdPlace() {
        return mBirdPlace;
    }

    /**
     * Get the Illustration.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


    /**
     * This method adds two texts and an image to the Parcel
     */
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mBirdName);
        parcel.writeString(mBirdPlace);
        parcel.writeInt(mImageResourceId);
    }
}
