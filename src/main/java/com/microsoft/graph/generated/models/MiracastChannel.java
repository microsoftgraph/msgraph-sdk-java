package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for Miracast channel.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MiracastChannel implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** One. */
    One("one"),
    /** Two. */
    Two("two"),
    /** Three. */
    Three("three"),
    /** Four. */
    Four("four"),
    /** Five. */
    Five("five"),
    /** Six. */
    Six("six"),
    /** Seven. */
    Seven("seven"),
    /** Eight. */
    Eight("eight"),
    /** Nine. */
    Nine("nine"),
    /** Ten. */
    Ten("ten"),
    /** Eleven. */
    Eleven("eleven"),
    /** Thirty-Six. */
    ThirtySix("thirtySix"),
    /** Forty. */
    Forty("forty"),
    /** Forty-Four. */
    FortyFour("fortyFour"),
    /** Forty-Eight. */
    FortyEight("fortyEight"),
    /** OneHundredForty-Nine. */
    OneHundredFortyNine("oneHundredFortyNine"),
    /** OneHundredFifty-Three. */
    OneHundredFiftyThree("oneHundredFiftyThree"),
    /** OneHundredFifty-Seven. */
    OneHundredFiftySeven("oneHundredFiftySeven"),
    /** OneHundredSixty-One. */
    OneHundredSixtyOne("oneHundredSixtyOne"),
    /** OneHundredSixty-Five. */
    OneHundredSixtyFive("oneHundredSixtyFive");
    public final String value;
    MiracastChannel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MiracastChannel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "one": return One;
            case "two": return Two;
            case "three": return Three;
            case "four": return Four;
            case "five": return Five;
            case "six": return Six;
            case "seven": return Seven;
            case "eight": return Eight;
            case "nine": return Nine;
            case "ten": return Ten;
            case "eleven": return Eleven;
            case "thirtySix": return ThirtySix;
            case "forty": return Forty;
            case "fortyFour": return FortyFour;
            case "fortyEight": return FortyEight;
            case "oneHundredFortyNine": return OneHundredFortyNine;
            case "oneHundredFiftyThree": return OneHundredFiftyThree;
            case "oneHundredFiftySeven": return OneHundredFiftySeven;
            case "oneHundredSixtyOne": return OneHundredSixtyOne;
            case "oneHundredSixtyFive": return OneHundredSixtyFive;
            default: return null;
        }
    }
}
