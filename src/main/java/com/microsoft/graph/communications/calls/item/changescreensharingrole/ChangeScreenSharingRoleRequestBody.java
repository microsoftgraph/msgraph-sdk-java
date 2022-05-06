package microsoft.graph.communications.calls.item.changescreensharingrole;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.ScreenSharingRole;
/** Provides operations to call the changeScreenSharingRole method.  */
public class ChangeScreenSharingRoleRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The role property  */
    private ScreenSharingRole _role;
    /**
     * Instantiates a new changeScreenSharingRoleRequestBody and sets the default values.
     * @return a void
     */
    public ChangeScreenSharingRoleRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a changeScreenSharingRoleRequestBody
     */
    @javax.annotation.Nonnull
    public static ChangeScreenSharingRoleRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangeScreenSharingRoleRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChangeScreenSharingRoleRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("role", (n) -> { currentObject.setRole(n.getEnumValue(ScreenSharingRole.class)); });
        }};
    }
    /**
     * Gets the role property value. The role property
     * @return a screenSharingRole
     */
    @javax.annotation.Nullable
    public ScreenSharingRole getRole() {
        return this._role;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("role", this.getRole());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     * @return a void
     */
    public void setRole(@javax.annotation.Nullable final ScreenSharingRole value) {
        this._role = value;
    }
}
