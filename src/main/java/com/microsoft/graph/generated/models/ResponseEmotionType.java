package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ResponseEmotionType implements ValuedEnum {
    None("none"),
    Confident("confident"),
    Excited("excited"),
    Happy("happy"),
    Motivated("motivated"),
    Peaceful("peaceful"),
    Ambitious("ambitious"),
    Cheerful("cheerful"),
    Comfortable("comfortable"),
    Creative("creative"),
    Determined("determined"),
    Energized("energized"),
    Focused("focused"),
    Fulfilled("fulfilled"),
    Grateful("grateful"),
    Included("included"),
    Inspired("inspired"),
    Optimistic("optimistic"),
    Proud("proud"),
    Successful("successful"),
    Valuable("valuable"),
    Annoyed("annoyed"),
    Bored("bored"),
    Calm("calm"),
    Confused("confused"),
    Glad("glad"),
    Content("content"),
    Pensive("pensive"),
    Reserved("reserved"),
    Restless("restless"),
    Shocked("shocked"),
    Tired("tired"),
    Angry("angry"),
    Depressed("depressed"),
    Exhausted("exhausted"),
    Lonely("lonely"),
    Nervous("nervous"),
    Anxious("anxious"),
    Apathetic("apathetic"),
    Concerned("concerned"),
    Disappointed("disappointed"),
    Frightened("frightened"),
    Frustrated("frustrated"),
    Hopeless("hopeless"),
    Hurt("hurt"),
    Jealous("jealous"),
    Miserable("miserable"),
    Overwhelmed("overwhelmed"),
    Skeptical("skeptical"),
    Stressed("stressed"),
    Stuck("stuck"),
    Worthless("worthless"),
    Awed("awed"),
    Ashamed("ashamed"),
    Curious("curious"),
    Sensitive("sensitive"),
    Sad("sad"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ResponseEmotionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResponseEmotionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "confident": return Confident;
            case "excited": return Excited;
            case "happy": return Happy;
            case "motivated": return Motivated;
            case "peaceful": return Peaceful;
            case "ambitious": return Ambitious;
            case "cheerful": return Cheerful;
            case "comfortable": return Comfortable;
            case "creative": return Creative;
            case "determined": return Determined;
            case "energized": return Energized;
            case "focused": return Focused;
            case "fulfilled": return Fulfilled;
            case "grateful": return Grateful;
            case "included": return Included;
            case "inspired": return Inspired;
            case "optimistic": return Optimistic;
            case "proud": return Proud;
            case "successful": return Successful;
            case "valuable": return Valuable;
            case "annoyed": return Annoyed;
            case "bored": return Bored;
            case "calm": return Calm;
            case "confused": return Confused;
            case "glad": return Glad;
            case "content": return Content;
            case "pensive": return Pensive;
            case "reserved": return Reserved;
            case "restless": return Restless;
            case "shocked": return Shocked;
            case "tired": return Tired;
            case "angry": return Angry;
            case "depressed": return Depressed;
            case "exhausted": return Exhausted;
            case "lonely": return Lonely;
            case "nervous": return Nervous;
            case "anxious": return Anxious;
            case "apathetic": return Apathetic;
            case "concerned": return Concerned;
            case "disappointed": return Disappointed;
            case "frightened": return Frightened;
            case "frustrated": return Frustrated;
            case "hopeless": return Hopeless;
            case "hurt": return Hurt;
            case "jealous": return Jealous;
            case "miserable": return Miserable;
            case "overwhelmed": return Overwhelmed;
            case "skeptical": return Skeptical;
            case "stressed": return Stressed;
            case "stuck": return Stuck;
            case "worthless": return Worthless;
            case "awed": return Awed;
            case "ashamed": return Ashamed;
            case "curious": return Curious;
            case "sensitive": return Sensitive;
            case "sad": return Sad;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
