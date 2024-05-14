package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    UnknownFutureValue("unknownFutureValue"),
    StapleTripleLeft("stapleTripleLeft"),
    StapleTripleTop("stapleTripleTop"),
    StapleTripleRight("stapleTripleRight"),
    StapleTripleBottom("stapleTripleBottom"),
    BindLeft("bindLeft"),
    BindTop("bindTop"),
    BindRight("bindRight"),
    BindBottom("bindBottom"),
    FoldAccordion("foldAccordion"),
    FoldDoubleGate("foldDoubleGate"),
    FoldGate("foldGate"),
    FoldHalf("foldHalf"),
    FoldHalfZ("foldHalfZ"),
    FoldLeftGate("foldLeftGate"),
    FoldLetter("foldLetter"),
    FoldParallel("foldParallel"),
    FoldPoster("foldPoster"),
    FoldRightGate("foldRightGate"),
    FoldZ("foldZ"),
    FoldEngineeringZ("foldEngineeringZ"),
    PunchTopLeft("punchTopLeft"),
    PunchBottomLeft("punchBottomLeft"),
    PunchTopRight("punchTopRight"),
    PunchBottomRight("punchBottomRight"),
    PunchDualLeft("punchDualLeft"),
    PunchDualTop("punchDualTop"),
    PunchDualRight("punchDualRight"),
    PunchDualBottom("punchDualBottom"),
    PunchTripleLeft("punchTripleLeft"),
    PunchTripleTop("punchTripleTop"),
    PunchTripleRight("punchTripleRight"),
    PunchTripleBottom("punchTripleBottom"),
    PunchQuadLeft("punchQuadLeft"),
    PunchQuadTop("punchQuadTop"),
    PunchQuadRight("punchQuadRight"),
    PunchQuadBottom("punchQuadBottom"),
    Fold("fold"),
    Trim("trim"),
    Bale("bale"),
    BookletMaker("bookletMaker"),
    Coat("coat"),
    Laminate("laminate"),
    TrimAfterPages("trimAfterPages"),
    TrimAfterDocuments("trimAfterDocuments"),
    TrimAfterCopies("trimAfterCopies"),
    TrimAfterJob("trimAfterJob");
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
            case "stapleTripleLeft": return StapleTripleLeft;
            case "stapleTripleTop": return StapleTripleTop;
            case "stapleTripleRight": return StapleTripleRight;
            case "stapleTripleBottom": return StapleTripleBottom;
            case "bindLeft": return BindLeft;
            case "bindTop": return BindTop;
            case "bindRight": return BindRight;
            case "bindBottom": return BindBottom;
            case "foldAccordion": return FoldAccordion;
            case "foldDoubleGate": return FoldDoubleGate;
            case "foldGate": return FoldGate;
            case "foldHalf": return FoldHalf;
            case "foldHalfZ": return FoldHalfZ;
            case "foldLeftGate": return FoldLeftGate;
            case "foldLetter": return FoldLetter;
            case "foldParallel": return FoldParallel;
            case "foldPoster": return FoldPoster;
            case "foldRightGate": return FoldRightGate;
            case "foldZ": return FoldZ;
            case "foldEngineeringZ": return FoldEngineeringZ;
            case "punchTopLeft": return PunchTopLeft;
            case "punchBottomLeft": return PunchBottomLeft;
            case "punchTopRight": return PunchTopRight;
            case "punchBottomRight": return PunchBottomRight;
            case "punchDualLeft": return PunchDualLeft;
            case "punchDualTop": return PunchDualTop;
            case "punchDualRight": return PunchDualRight;
            case "punchDualBottom": return PunchDualBottom;
            case "punchTripleLeft": return PunchTripleLeft;
            case "punchTripleTop": return PunchTripleTop;
            case "punchTripleRight": return PunchTripleRight;
            case "punchTripleBottom": return PunchTripleBottom;
            case "punchQuadLeft": return PunchQuadLeft;
            case "punchQuadTop": return PunchQuadTop;
            case "punchQuadRight": return PunchQuadRight;
            case "punchQuadBottom": return PunchQuadBottom;
            case "fold": return Fold;
            case "trim": return Trim;
            case "bale": return Bale;
            case "bookletMaker": return BookletMaker;
            case "coat": return Coat;
            case "laminate": return Laminate;
            case "trimAfterPages": return TrimAfterPages;
            case "trimAfterDocuments": return TrimAfterDocuments;
            case "trimAfterCopies": return TrimAfterCopies;
            case "trimAfterJob": return TrimAfterJob;
            default: return null;
        }
    }
}
