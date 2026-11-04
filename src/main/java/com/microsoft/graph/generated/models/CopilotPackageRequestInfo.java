package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The business identifier, first explicit assignee contact, all explicit assignees, submission date, and additional collected data of one package request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotPackageRequestInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CopilotPackageRequestInfo} and sets the default values.
     */
    public CopilotPackageRequestInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotPackageRequestInfo}
     */
    @jakarta.annotation.Nonnull
    public static CopilotPackageRequestInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotPackageRequestInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the additionalMetadata property value. Additional data collected for this request, represented as a JSON object. Null when no value is available. Read-only.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAdditionalMetadata() {
        return this.backingStore.get("additionalMetadata");
    }
    /**
     * Gets the assignees property value. All explicit assigned recipients returned by Governance, in source order with duplicates preserved. The first member supplies the requestedBy display contact; the collection is not truncated to that member. Empty means no explicit members were returned, not that the request has no audience. Broad or all-users audiences are not expanded or represented by this collection.
     * @return a {@link java.util.List<CopilotPackageRequestPrincipal>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CopilotPackageRequestPrincipal> getAssignees() {
        return this.backingStore.get("assignees");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("additionalMetadata", (n) -> { this.setAdditionalMetadata(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("assignees", (n) -> { this.setAssignees(n.getCollectionOfObjectValues(CopilotPackageRequestPrincipal::createFromDiscriminatorValue)); });
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("requestedBy", (n) -> { this.setRequestedBy(n.getObjectValue(EmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("requestedDateTime", (n) -> { this.setRequestedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. The business request identifier returned by Governance, or null when unavailable. Not a requester identity, title identifier, correlation identifier, or Graph resource key or address. Uniqueness and lifetime stability are not guaranteed. No existing Graph operation in this proposal consumes this value.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.backingStore.get("identifier");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the requestedBy property value. The display name and contact address of the first explicitly assigned principal. The address may be a mail address or user principal name. Null only when there are no explicit assignees; a present first assignee may have null name and address. The first principal may be a user, group, or agent; requestedBy does not identify the request creator.
     * @return a {@link EmailAddress}
     */
    @jakarta.annotation.Nullable
    public EmailAddress getRequestedBy() {
        return this.backingStore.get("requestedBy");
    }
    /**
     * Gets the requestedDateTime property value. The request submission date and time in ISO 8601 format. Null when unknown; independent of assignee presence and not the package creation or modification time.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestedDateTime() {
        return this.backingStore.get("requestedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the additionalMetadata property value. Additional data collected for this request, represented as a JSON object. Null when no value is available. Read-only.
     * @param value Value to set for the additionalMetadata property.
     */
    public void setAdditionalMetadata(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("additionalMetadata", value);
    }
    /**
     * Sets the assignees property value. All explicit assigned recipients returned by Governance, in source order with duplicates preserved. The first member supplies the requestedBy display contact; the collection is not truncated to that member. Empty means no explicit members were returned, not that the request has no audience. Broad or all-users audiences are not expanded or represented by this collection.
     * @param value Value to set for the assignees property.
     */
    public void setAssignees(@jakarta.annotation.Nullable final java.util.List<CopilotPackageRequestPrincipal> value) {
        this.backingStore.set("assignees", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the identifier property value. The business request identifier returned by Governance, or null when unavailable. Not a requester identity, title identifier, correlation identifier, or Graph resource key or address. Uniqueness and lifetime stability are not guaranteed. No existing Graph operation in this proposal consumes this value.
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identifier", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the requestedBy property value. The display name and contact address of the first explicitly assigned principal. The address may be a mail address or user principal name. Null only when there are no explicit assignees; a present first assignee may have null name and address. The first principal may be a user, group, or agent; requestedBy does not identify the request creator.
     * @param value Value to set for the requestedBy property.
     */
    public void setRequestedBy(@jakarta.annotation.Nullable final EmailAddress value) {
        this.backingStore.set("requestedBy", value);
    }
    /**
     * Sets the requestedDateTime property value. The request submission date and time in ISO 8601 format. Null when unknown; independent of assignee presence and not the package creation or modification time.
     * @param value Value to set for the requestedDateTime property.
     */
    public void setRequestedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestedDateTime", value);
    }
}
