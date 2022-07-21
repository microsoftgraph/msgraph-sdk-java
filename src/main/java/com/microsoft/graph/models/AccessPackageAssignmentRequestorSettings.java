package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentRequestorSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If false, the requestor is not permitted to include a schedule in their request. */
    private Boolean _allowCustomAssignmentSchedule;
    /** If true, allows on-behalf-of requestors to create a request to add access for another principal. */
    private Boolean _enableOnBehalfRequestorsToAddAccess;
    /** If true, allows on-behalf-of requestors to create a request to remove access for another principal. */
    private Boolean _enableOnBehalfRequestorsToRemoveAccess;
    /** If true, allows on-behalf-of requestors to create a request to update access for another principal. */
    private Boolean _enableOnBehalfRequestorsToUpdateAccess;
    /** If true, allows requestors to create a request to add access for themselves. */
    private Boolean _enableTargetsToSelfAddAccess;
    /** If true, allows requestors to create a request to remove their access. */
    private Boolean _enableTargetsToSelfRemoveAccess;
    /** If true, allows requestors to create a request to update their access. */
    private Boolean _enableTargetsToSelfUpdateAccess;
    /** The OdataType property */
    private String _odataType;
    /** The principals who can request on-behalf-of others. */
    private java.util.List<SubjectSet> _onBehalfRequestors;
    /**
     * Instantiates a new accessPackageAssignmentRequestorSettings and sets the default values.
     * @return a void
     */
    public AccessPackageAssignmentRequestorSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.accessPackageAssignmentRequestorSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentRequestorSettings
     */
    @javax.annotation.Nonnull
    public static AccessPackageAssignmentRequestorSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequestorSettings();
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
     * Gets the allowCustomAssignmentSchedule property value. If false, the requestor is not permitted to include a schedule in their request.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowCustomAssignmentSchedule() {
        return this._allowCustomAssignmentSchedule;
    }
    /**
     * Gets the enableOnBehalfRequestorsToAddAccess property value. If true, allows on-behalf-of requestors to create a request to add access for another principal.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableOnBehalfRequestorsToAddAccess() {
        return this._enableOnBehalfRequestorsToAddAccess;
    }
    /**
     * Gets the enableOnBehalfRequestorsToRemoveAccess property value. If true, allows on-behalf-of requestors to create a request to remove access for another principal.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableOnBehalfRequestorsToRemoveAccess() {
        return this._enableOnBehalfRequestorsToRemoveAccess;
    }
    /**
     * Gets the enableOnBehalfRequestorsToUpdateAccess property value. If true, allows on-behalf-of requestors to create a request to update access for another principal.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableOnBehalfRequestorsToUpdateAccess() {
        return this._enableOnBehalfRequestorsToUpdateAccess;
    }
    /**
     * Gets the enableTargetsToSelfAddAccess property value. If true, allows requestors to create a request to add access for themselves.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableTargetsToSelfAddAccess() {
        return this._enableTargetsToSelfAddAccess;
    }
    /**
     * Gets the enableTargetsToSelfRemoveAccess property value. If true, allows requestors to create a request to remove their access.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableTargetsToSelfRemoveAccess() {
        return this._enableTargetsToSelfRemoveAccess;
    }
    /**
     * Gets the enableTargetsToSelfUpdateAccess property value. If true, allows requestors to create a request to update their access.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableTargetsToSelfUpdateAccess() {
        return this._enableTargetsToSelfUpdateAccess;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAssignmentRequestorSettings currentObject = this;
        return new HashMap<>(9) {{
            this.put("allowCustomAssignmentSchedule", (n) -> { currentObject.setAllowCustomAssignmentSchedule(n.getBooleanValue()); });
            this.put("enableOnBehalfRequestorsToAddAccess", (n) -> { currentObject.setEnableOnBehalfRequestorsToAddAccess(n.getBooleanValue()); });
            this.put("enableOnBehalfRequestorsToRemoveAccess", (n) -> { currentObject.setEnableOnBehalfRequestorsToRemoveAccess(n.getBooleanValue()); });
            this.put("enableOnBehalfRequestorsToUpdateAccess", (n) -> { currentObject.setEnableOnBehalfRequestorsToUpdateAccess(n.getBooleanValue()); });
            this.put("enableTargetsToSelfAddAccess", (n) -> { currentObject.setEnableTargetsToSelfAddAccess(n.getBooleanValue()); });
            this.put("enableTargetsToSelfRemoveAccess", (n) -> { currentObject.setEnableTargetsToSelfRemoveAccess(n.getBooleanValue()); });
            this.put("enableTargetsToSelfUpdateAccess", (n) -> { currentObject.setEnableTargetsToSelfUpdateAccess(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("onBehalfRequestors", (n) -> { currentObject.setOnBehalfRequestors(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the onBehalfRequestors property value. The principals who can request on-behalf-of others.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getOnBehalfRequestors() {
        return this._onBehalfRequestors;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowCustomAssignmentSchedule", this.getAllowCustomAssignmentSchedule());
        writer.writeBooleanValue("enableOnBehalfRequestorsToAddAccess", this.getEnableOnBehalfRequestorsToAddAccess());
        writer.writeBooleanValue("enableOnBehalfRequestorsToRemoveAccess", this.getEnableOnBehalfRequestorsToRemoveAccess());
        writer.writeBooleanValue("enableOnBehalfRequestorsToUpdateAccess", this.getEnableOnBehalfRequestorsToUpdateAccess());
        writer.writeBooleanValue("enableTargetsToSelfAddAccess", this.getEnableTargetsToSelfAddAccess());
        writer.writeBooleanValue("enableTargetsToSelfRemoveAccess", this.getEnableTargetsToSelfRemoveAccess());
        writer.writeBooleanValue("enableTargetsToSelfUpdateAccess", this.getEnableTargetsToSelfUpdateAccess());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("onBehalfRequestors", this.getOnBehalfRequestors());
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
     * Sets the allowCustomAssignmentSchedule property value. If false, the requestor is not permitted to include a schedule in their request.
     * @param value Value to set for the allowCustomAssignmentSchedule property.
     * @return a void
     */
    public void setAllowCustomAssignmentSchedule(@javax.annotation.Nullable final Boolean value) {
        this._allowCustomAssignmentSchedule = value;
    }
    /**
     * Sets the enableOnBehalfRequestorsToAddAccess property value. If true, allows on-behalf-of requestors to create a request to add access for another principal.
     * @param value Value to set for the enableOnBehalfRequestorsToAddAccess property.
     * @return a void
     */
    public void setEnableOnBehalfRequestorsToAddAccess(@javax.annotation.Nullable final Boolean value) {
        this._enableOnBehalfRequestorsToAddAccess = value;
    }
    /**
     * Sets the enableOnBehalfRequestorsToRemoveAccess property value. If true, allows on-behalf-of requestors to create a request to remove access for another principal.
     * @param value Value to set for the enableOnBehalfRequestorsToRemoveAccess property.
     * @return a void
     */
    public void setEnableOnBehalfRequestorsToRemoveAccess(@javax.annotation.Nullable final Boolean value) {
        this._enableOnBehalfRequestorsToRemoveAccess = value;
    }
    /**
     * Sets the enableOnBehalfRequestorsToUpdateAccess property value. If true, allows on-behalf-of requestors to create a request to update access for another principal.
     * @param value Value to set for the enableOnBehalfRequestorsToUpdateAccess property.
     * @return a void
     */
    public void setEnableOnBehalfRequestorsToUpdateAccess(@javax.annotation.Nullable final Boolean value) {
        this._enableOnBehalfRequestorsToUpdateAccess = value;
    }
    /**
     * Sets the enableTargetsToSelfAddAccess property value. If true, allows requestors to create a request to add access for themselves.
     * @param value Value to set for the enableTargetsToSelfAddAccess property.
     * @return a void
     */
    public void setEnableTargetsToSelfAddAccess(@javax.annotation.Nullable final Boolean value) {
        this._enableTargetsToSelfAddAccess = value;
    }
    /**
     * Sets the enableTargetsToSelfRemoveAccess property value. If true, allows requestors to create a request to remove their access.
     * @param value Value to set for the enableTargetsToSelfRemoveAccess property.
     * @return a void
     */
    public void setEnableTargetsToSelfRemoveAccess(@javax.annotation.Nullable final Boolean value) {
        this._enableTargetsToSelfRemoveAccess = value;
    }
    /**
     * Sets the enableTargetsToSelfUpdateAccess property value. If true, allows requestors to create a request to update their access.
     * @param value Value to set for the enableTargetsToSelfUpdateAccess property.
     * @return a void
     */
    public void setEnableTargetsToSelfUpdateAccess(@javax.annotation.Nullable final Boolean value) {
        this._enableTargetsToSelfUpdateAccess = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the onBehalfRequestors property value. The principals who can request on-behalf-of others.
     * @param value Value to set for the onBehalfRequestors property.
     * @return a void
     */
    public void setOnBehalfRequestors(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this._onBehalfRequestors = value;
    }
}
