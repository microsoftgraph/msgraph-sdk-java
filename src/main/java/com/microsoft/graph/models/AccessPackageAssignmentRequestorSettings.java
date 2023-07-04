package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentRequestorSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * False indicates that the requestor is not permitted to include a schedule in their request.
     */
    private Boolean allowCustomAssignmentSchedule;
    /**
     * True allows on-behalf-of requestors to create a request to add access for another principal.
     */
    private Boolean enableOnBehalfRequestorsToAddAccess;
    /**
     * True allows on-behalf-of requestors to create a request to remove access for another principal.
     */
    private Boolean enableOnBehalfRequestorsToRemoveAccess;
    /**
     * True allows on-behalf-of requestors to create a request to update access for another principal.
     */
    private Boolean enableOnBehalfRequestorsToUpdateAccess;
    /**
     * True allows requestors to create a request to add access for themselves.
     */
    private Boolean enableTargetsToSelfAddAccess;
    /**
     * True allows requestors to create a request to remove their access.
     */
    private Boolean enableTargetsToSelfRemoveAccess;
    /**
     * True allows requestors to create a request to update their access.
     */
    private Boolean enableTargetsToSelfUpdateAccess;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The principals who can request on-behalf-of others.
     */
    private java.util.List<SubjectSet> onBehalfRequestors;
    /**
     * Instantiates a new accessPackageAssignmentRequestorSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentRequestorSettings() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
    }
    /**
     * Gets the allowCustomAssignmentSchedule property value. False indicates that the requestor is not permitted to include a schedule in their request.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowCustomAssignmentSchedule() {
        return this.allowCustomAssignmentSchedule;
    }
    /**
     * Gets the enableOnBehalfRequestorsToAddAccess property value. True allows on-behalf-of requestors to create a request to add access for another principal.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableOnBehalfRequestorsToAddAccess() {
        return this.enableOnBehalfRequestorsToAddAccess;
    }
    /**
     * Gets the enableOnBehalfRequestorsToRemoveAccess property value. True allows on-behalf-of requestors to create a request to remove access for another principal.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableOnBehalfRequestorsToRemoveAccess() {
        return this.enableOnBehalfRequestorsToRemoveAccess;
    }
    /**
     * Gets the enableOnBehalfRequestorsToUpdateAccess property value. True allows on-behalf-of requestors to create a request to update access for another principal.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableOnBehalfRequestorsToUpdateAccess() {
        return this.enableOnBehalfRequestorsToUpdateAccess;
    }
    /**
     * Gets the enableTargetsToSelfAddAccess property value. True allows requestors to create a request to add access for themselves.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableTargetsToSelfAddAccess() {
        return this.enableTargetsToSelfAddAccess;
    }
    /**
     * Gets the enableTargetsToSelfRemoveAccess property value. True allows requestors to create a request to remove their access.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableTargetsToSelfRemoveAccess() {
        return this.enableTargetsToSelfRemoveAccess;
    }
    /**
     * Gets the enableTargetsToSelfUpdateAccess property value. True allows requestors to create a request to update their access.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableTargetsToSelfUpdateAccess() {
        return this.enableTargetsToSelfUpdateAccess;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("allowCustomAssignmentSchedule", (n) -> { this.setAllowCustomAssignmentSchedule(n.getBooleanValue()); });
        deserializerMap.put("enableOnBehalfRequestorsToAddAccess", (n) -> { this.setEnableOnBehalfRequestorsToAddAccess(n.getBooleanValue()); });
        deserializerMap.put("enableOnBehalfRequestorsToRemoveAccess", (n) -> { this.setEnableOnBehalfRequestorsToRemoveAccess(n.getBooleanValue()); });
        deserializerMap.put("enableOnBehalfRequestorsToUpdateAccess", (n) -> { this.setEnableOnBehalfRequestorsToUpdateAccess(n.getBooleanValue()); });
        deserializerMap.put("enableTargetsToSelfAddAccess", (n) -> { this.setEnableTargetsToSelfAddAccess(n.getBooleanValue()); });
        deserializerMap.put("enableTargetsToSelfRemoveAccess", (n) -> { this.setEnableTargetsToSelfRemoveAccess(n.getBooleanValue()); });
        deserializerMap.put("enableTargetsToSelfUpdateAccess", (n) -> { this.setEnableTargetsToSelfUpdateAccess(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("onBehalfRequestors", (n) -> { this.setOnBehalfRequestors(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the onBehalfRequestors property value. The principals who can request on-behalf-of others.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getOnBehalfRequestors() {
        return this.onBehalfRequestors;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowCustomAssignmentSchedule property value. False indicates that the requestor is not permitted to include a schedule in their request.
     * @param value Value to set for the allowCustomAssignmentSchedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowCustomAssignmentSchedule(@javax.annotation.Nullable final Boolean value) {
        this.allowCustomAssignmentSchedule = value;
    }
    /**
     * Sets the enableOnBehalfRequestorsToAddAccess property value. True allows on-behalf-of requestors to create a request to add access for another principal.
     * @param value Value to set for the enableOnBehalfRequestorsToAddAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableOnBehalfRequestorsToAddAccess(@javax.annotation.Nullable final Boolean value) {
        this.enableOnBehalfRequestorsToAddAccess = value;
    }
    /**
     * Sets the enableOnBehalfRequestorsToRemoveAccess property value. True allows on-behalf-of requestors to create a request to remove access for another principal.
     * @param value Value to set for the enableOnBehalfRequestorsToRemoveAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableOnBehalfRequestorsToRemoveAccess(@javax.annotation.Nullable final Boolean value) {
        this.enableOnBehalfRequestorsToRemoveAccess = value;
    }
    /**
     * Sets the enableOnBehalfRequestorsToUpdateAccess property value. True allows on-behalf-of requestors to create a request to update access for another principal.
     * @param value Value to set for the enableOnBehalfRequestorsToUpdateAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableOnBehalfRequestorsToUpdateAccess(@javax.annotation.Nullable final Boolean value) {
        this.enableOnBehalfRequestorsToUpdateAccess = value;
    }
    /**
     * Sets the enableTargetsToSelfAddAccess property value. True allows requestors to create a request to add access for themselves.
     * @param value Value to set for the enableTargetsToSelfAddAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableTargetsToSelfAddAccess(@javax.annotation.Nullable final Boolean value) {
        this.enableTargetsToSelfAddAccess = value;
    }
    /**
     * Sets the enableTargetsToSelfRemoveAccess property value. True allows requestors to create a request to remove their access.
     * @param value Value to set for the enableTargetsToSelfRemoveAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableTargetsToSelfRemoveAccess(@javax.annotation.Nullable final Boolean value) {
        this.enableTargetsToSelfRemoveAccess = value;
    }
    /**
     * Sets the enableTargetsToSelfUpdateAccess property value. True allows requestors to create a request to update their access.
     * @param value Value to set for the enableTargetsToSelfUpdateAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableTargetsToSelfUpdateAccess(@javax.annotation.Nullable final Boolean value) {
        this.enableTargetsToSelfUpdateAccess = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the onBehalfRequestors property value. The principals who can request on-behalf-of others.
     * @param value Value to set for the onBehalfRequestors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnBehalfRequestors(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.onBehalfRequestors = value;
    }
}
