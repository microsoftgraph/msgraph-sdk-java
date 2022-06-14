package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum ApplicationGuardBlockClipboardSharingType implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Block clipboard to share data both from Host to Container and from Container to Host */
    BlockBoth("blockBoth"),
    /** Block clipboard to share data from Host to Container */
    BlockHostToContainer("blockHostToContainer"),
    /** Block clipboard to share data from Container to Host */
    BlockContainerToHost("blockContainerToHost"),
    /** Block clipboard to share data neither from Host to Container nor from Container to Host */
    BlockNone("blockNone");
    public final String value;
    ApplicationGuardBlockClipboardSharingType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ApplicationGuardBlockClipboardSharingType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "blockBoth": return BlockBoth;
            case "blockHostToContainer": return BlockHostToContainer;
            case "blockContainerToHost": return BlockContainerToHost;
            case "blockNone": return BlockNone;
            default: return null;
        }
    }
}
