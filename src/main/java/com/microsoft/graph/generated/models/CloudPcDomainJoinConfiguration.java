package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcDomainJoinConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcDomainJoinConfiguration} and sets the default values.
     */
    public CloudPcDomainJoinConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcDomainJoinConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcDomainJoinConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcDomainJoinConfiguration();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the domainJoinType property value. Specifies the method by which the provisioned Cloud PC joins Microsoft Entra ID. If you choose the hybridAzureADJoin type, only provide a value for the onPremisesConnectionId property and leave the regionName property empty. If you choose the azureADJoin type, provide a value for either the onPremisesConnectionId or the regionName property. The possible values are: azureADJoin, hybridAzureADJoin, unknownFutureValue.
     * @return a {@link CloudPcDomainJoinType}
     */
    @jakarta.annotation.Nullable
    public CloudPcDomainJoinType getDomainJoinType() {
        return this.backingStore.get("domainJoinType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("domainJoinType", (n) -> { this.setDomainJoinType(n.getEnumValue(CloudPcDomainJoinType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("onPremisesConnectionId", (n) -> { this.setOnPremisesConnectionId(n.getStringValue()); });
        deserializerMap.put("regionGroup", (n) -> { this.setRegionGroup(n.getEnumValue(CloudPcRegionGroup::forValue)); });
        deserializerMap.put("regionName", (n) -> { this.setRegionName(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the onPremisesConnectionId property value. The Azure network connection ID that matches the virtual network IT admins want the provisioning policy to use when they create Cloud PCs. You can use this property in both domain join types: Azure AD joined or Hybrid Microsoft Entra joined. If you enter an onPremisesConnectionId, leave the regionName property empty.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesConnectionId() {
        return this.backingStore.get("onPremisesConnectionId");
    }
    /**
     * Gets the regionGroup property value. The logical geographic group this region belongs to. Multiple regions can belong to one region group. A customer can select a regionGroup when they provision a Cloud PC, and the Cloud PC is put in one of the regions in the group based on resource status. For example, the Europe region group contains the Northern Europe and Western Europe regions. The possible values are: default, australia, canada, usCentral, usEast, usWest, france, germany, europeUnion, unitedKingdom, japan, asia, india, southAmerica, euap, usGovernment, usGovernmentDOD, unknownFutureValue, norway, switzerland, southKorea. Use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: norway, switzerland, southKorea. Read-only.
     * @return a {@link CloudPcRegionGroup}
     */
    @jakarta.annotation.Nullable
    public CloudPcRegionGroup getRegionGroup() {
        return this.backingStore.get("regionGroup");
    }
    /**
     * Gets the regionName property value. The supported Azure region where the IT admin wants the provisioning policy to create Cloud PCs. Within this region, the Windows 365 service creates and manages the underlying virtual network. This option is available only when the IT admin selects Microsoft Entra joined as the domain join type. If you enter a regionName, leave the onPremisesConnectionId property empty.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegionName() {
        return this.backingStore.get("regionName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("domainJoinType", this.getDomainJoinType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("onPremisesConnectionId", this.getOnPremisesConnectionId());
        writer.writeEnumValue("regionGroup", this.getRegionGroup());
        writer.writeStringValue("regionName", this.getRegionName());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the domainJoinType property value. Specifies the method by which the provisioned Cloud PC joins Microsoft Entra ID. If you choose the hybridAzureADJoin type, only provide a value for the onPremisesConnectionId property and leave the regionName property empty. If you choose the azureADJoin type, provide a value for either the onPremisesConnectionId or the regionName property. The possible values are: azureADJoin, hybridAzureADJoin, unknownFutureValue.
     * @param value Value to set for the domainJoinType property.
     */
    public void setDomainJoinType(@jakarta.annotation.Nullable final CloudPcDomainJoinType value) {
        this.backingStore.set("domainJoinType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the onPremisesConnectionId property value. The Azure network connection ID that matches the virtual network IT admins want the provisioning policy to use when they create Cloud PCs. You can use this property in both domain join types: Azure AD joined or Hybrid Microsoft Entra joined. If you enter an onPremisesConnectionId, leave the regionName property empty.
     * @param value Value to set for the onPremisesConnectionId property.
     */
    public void setOnPremisesConnectionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onPremisesConnectionId", value);
    }
    /**
     * Sets the regionGroup property value. The logical geographic group this region belongs to. Multiple regions can belong to one region group. A customer can select a regionGroup when they provision a Cloud PC, and the Cloud PC is put in one of the regions in the group based on resource status. For example, the Europe region group contains the Northern Europe and Western Europe regions. The possible values are: default, australia, canada, usCentral, usEast, usWest, france, germany, europeUnion, unitedKingdom, japan, asia, india, southAmerica, euap, usGovernment, usGovernmentDOD, unknownFutureValue, norway, switzerland, southKorea. Use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: norway, switzerland, southKorea. Read-only.
     * @param value Value to set for the regionGroup property.
     */
    public void setRegionGroup(@jakarta.annotation.Nullable final CloudPcRegionGroup value) {
        this.backingStore.set("regionGroup", value);
    }
    /**
     * Sets the regionName property value. The supported Azure region where the IT admin wants the provisioning policy to create Cloud PCs. Within this region, the Windows 365 service creates and manages the underlying virtual network. This option is available only when the IT admin selects Microsoft Entra joined as the domain join type. If you enter a regionName, leave the onPremisesConnectionId property empty.
     * @param value Value to set for the regionName property.
     */
    public void setRegionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("regionName", value);
    }
}
