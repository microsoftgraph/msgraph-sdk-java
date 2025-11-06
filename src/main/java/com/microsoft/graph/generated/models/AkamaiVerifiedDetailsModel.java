package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AkamaiVerifiedDetailsModel extends WebApplicationFirewallVerifiedDetails implements Parsable {
    /**
     * Instantiates a new {@link AkamaiVerifiedDetailsModel} and sets the default values.
     */
    public AkamaiVerifiedDetailsModel() {
        super();
        this.setOdataType("#microsoft.graph.akamaiVerifiedDetailsModel");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AkamaiVerifiedDetailsModel}
     */
    @jakarta.annotation.Nonnull
    public static AkamaiVerifiedDetailsModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AkamaiVerifiedDetailsModel();
    }
    /**
     * Gets the activeAttackGroups property value. The activeAttackGroups property
     * @return a {@link java.util.List<AkamaiAttackGroupActionModel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AkamaiAttackGroupActionModel> getActiveAttackGroups() {
        return this.backingStore.get("activeAttackGroups");
    }
    /**
     * Gets the activeCustomRules property value. The activeCustomRules property
     * @return a {@link java.util.List<AkamaiCustomRuleModel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AkamaiCustomRuleModel> getActiveCustomRules() {
        return this.backingStore.get("activeCustomRules");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeAttackGroups", (n) -> { this.setActiveAttackGroups(n.getCollectionOfObjectValues(AkamaiAttackGroupActionModel::createFromDiscriminatorValue)); });
        deserializerMap.put("activeCustomRules", (n) -> { this.setActiveCustomRules(n.getCollectionOfObjectValues(AkamaiCustomRuleModel::createFromDiscriminatorValue)); });
        deserializerMap.put("rapidRules", (n) -> { this.setRapidRules(n.getObjectValue(AkamaiRapidRulesModel::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rapidRules property value. The rapidRules property
     * @return a {@link AkamaiRapidRulesModel}
     */
    @jakarta.annotation.Nullable
    public AkamaiRapidRulesModel getRapidRules() {
        return this.backingStore.get("rapidRules");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("activeAttackGroups", this.getActiveAttackGroups());
        writer.writeCollectionOfObjectValues("activeCustomRules", this.getActiveCustomRules());
        writer.writeObjectValue("rapidRules", this.getRapidRules());
    }
    /**
     * Sets the activeAttackGroups property value. The activeAttackGroups property
     * @param value Value to set for the activeAttackGroups property.
     */
    public void setActiveAttackGroups(@jakarta.annotation.Nullable final java.util.List<AkamaiAttackGroupActionModel> value) {
        this.backingStore.set("activeAttackGroups", value);
    }
    /**
     * Sets the activeCustomRules property value. The activeCustomRules property
     * @param value Value to set for the activeCustomRules property.
     */
    public void setActiveCustomRules(@jakarta.annotation.Nullable final java.util.List<AkamaiCustomRuleModel> value) {
        this.backingStore.set("activeCustomRules", value);
    }
    /**
     * Sets the rapidRules property value. The rapidRules property
     * @param value Value to set for the rapidRules property.
     */
    public void setRapidRules(@jakarta.annotation.Nullable final AkamaiRapidRulesModel value) {
        this.backingStore.set("rapidRules", value);
    }
}
