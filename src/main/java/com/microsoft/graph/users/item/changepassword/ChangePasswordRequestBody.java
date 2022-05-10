package microsoft.graph.users.item.changepassword;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the changePassword method. */
public class ChangePasswordRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The currentPassword property */
    private String _currentPassword;
    /** The newPassword property */
    private String _newPassword;
    /**
     * Instantiates a new changePasswordRequestBody and sets the default values.
     * @return a void
     */
    public ChangePasswordRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a changePasswordRequestBody
     */
    @javax.annotation.Nonnull
    public static ChangePasswordRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangePasswordRequestBody();
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
     * Gets the currentPassword property value. The currentPassword property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrentPassword() {
        return this._currentPassword;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChangePasswordRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("currentPassword", (n) -> { currentObject.setCurrentPassword(n.getStringValue()); });
            this.put("newPassword", (n) -> { currentObject.setNewPassword(n.getStringValue()); });
        }};
    }
    /**
     * Gets the newPassword property value. The newPassword property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNewPassword() {
        return this._newPassword;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("currentPassword", this.getCurrentPassword());
        writer.writeStringValue("newPassword", this.getNewPassword());
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
     * Sets the currentPassword property value. The currentPassword property
     * @param value Value to set for the currentPassword property.
     * @return a void
     */
    public void setCurrentPassword(@javax.annotation.Nullable final String value) {
        this._currentPassword = value;
    }
    /**
     * Sets the newPassword property value. The newPassword property
     * @param value Value to set for the newPassword property.
     * @return a void
     */
    public void setNewPassword(@javax.annotation.Nullable final String value) {
        this._newPassword = value;
    }
}
