package microsoft.graph.users.item.authentication.microsoftauthenticatormethods.item.device.memberof.item.user.assignlicense;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.AssignedLicense;
/** Provides operations to call the assignLicense method. */
public class AssignLicensePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The addLicenses property */
    private java.util.List<AssignedLicense> _addLicenses;
    /** The removeLicenses property */
    private java.util.List<String> _removeLicenses;
    /**
     * Instantiates a new assignLicensePostRequestBody and sets the default values.
     * @return a void
     */
    public AssignLicensePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignLicensePostRequestBody
     */
    @javax.annotation.Nonnull
    public static AssignLicensePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignLicensePostRequestBody();
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
     * Gets the addLicenses property value. The addLicenses property
     * @return a assignedLicense
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedLicense> getAddLicenses() {
        return this._addLicenses;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AssignLicensePostRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("addLicenses", (n) -> { currentObject.setAddLicenses(n.getCollectionOfObjectValues(AssignedLicense::createFromDiscriminatorValue)); });
            this.put("removeLicenses", (n) -> { currentObject.setRemoveLicenses(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the removeLicenses property value. The removeLicenses property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRemoveLicenses() {
        return this._removeLicenses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("addLicenses", this.getAddLicenses());
        writer.writeCollectionOfPrimitiveValues("removeLicenses", this.getRemoveLicenses());
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
     * Sets the addLicenses property value. The addLicenses property
     * @param value Value to set for the addLicenses property.
     * @return a void
     */
    public void setAddLicenses(@javax.annotation.Nullable final java.util.List<AssignedLicense> value) {
        this._addLicenses = value;
    }
    /**
     * Sets the removeLicenses property value. The removeLicenses property
     * @param value Value to set for the removeLicenses property.
     * @return a void
     */
    public void setRemoveLicenses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._removeLicenses = value;
    }
}
