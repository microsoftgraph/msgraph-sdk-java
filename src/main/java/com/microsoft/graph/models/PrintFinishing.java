package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PrintFinishing implements ValuedEnum {
    None("none"),
    Staple("staple"),
    Punch("punch"),
    Cover("cover"),
    Bind("bind"),
    SaddleStitch("saddleStitch"),
    StitchEdge("stitchEdge"),
    StapleTopLeft("stapleTopLeft"),
    StapleBottomLeft("stapleBottomLeft"),
    StapleTopRight("stapleTopRight"),
    StapleBottomRight("stapleBottomRight"),
    StitchLeftEdge("stitchLeftEdge"),
    StitchTopEdge("stitchTopEdge"),
    StitchRightEdge("stitchRightEdge"),
    StitchBottomEdge("stitchBottomEdge"),
    StapleDualLeft("stapleDualLeft"),
    StapleDualTop("stapleDualTop"),
    StapleDualRight("stapleDualRight"),
    StapleDualBottom("stapleDualBottom"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrintFinishing(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrintFinishing forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "staple": return Staple;
            case "punch": return Punch;
            case "cover": return Cover;
            case "bind": return Bind;
            case "saddleStitch": return SaddleStitch;
            case "stitchEdge": return StitchEdge;
            case "stapleTopLeft": return StapleTopLeft;
            case "stapleBottomLeft": return StapleBottomLeft;
            case "stapleTopRight": return StapleTopRight;
            case "stapleBottomRight": return StapleBottomRight;
            case "stitchLeftEdge": return StitchLeftEdge;
            case "stitchTopEdge": return StitchTopEdge;
            case "stitchRightEdge": return StitchRightEdge;
            case "stitchBottomEdge": return StitchBottomEdge;
            case "stapleDualLeft": return StapleDualLeft;
            case "stapleDualTop": return StapleDualTop;
            case "stapleDualRight": return StapleDualRight;
            case "stapleDualBottom": return StapleDualBottom;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
