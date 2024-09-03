package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointProtectionPolicy extends ProtectionPolicyBase implements Parsable {
    /**
     * Instantiates a new {@link SharePointProtectionPolicy} and sets the default values.
     */
    public SharePointProtectionPolicy() {
        super();
        this.setOdataType("#microsoft.graph.sharePointProtectionPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointProtectionPolicy}
     */
    @jakarta.annotation.Nonnull
    public static SharePointProtectionPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointProtectionPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("siteInclusionRules", (n) -> { this.setSiteInclusionRules(n.getCollectionOfObjectValues(SiteProtectionRule::createFromDiscriminatorValue)); });
        deserializerMap.put("siteProtectionUnits", (n) -> { this.setSiteProtectionUnits(n.getCollectionOfObjectValues(SiteProtectionUnit::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the siteInclusionRules property value. The rules associated with the SharePoint Protection policy.
     * @return a {@link java.util.List<SiteProtectionRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteProtectionRule> getSiteInclusionRules() {
        return this.backingStore.get("siteInclusionRules");
    }
    /**
     * Gets the siteProtectionUnits property value. The protection units (sites) that are protected under the site protection policy.
     * @return a {@link java.util.List<SiteProtectionUnit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteProtectionUnit> getSiteProtectionUnits() {
        return this.backingStore.get("siteProtectionUnits");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("siteInclusionRules", this.getSiteInclusionRules());
        writer.writeCollectionOfObjectValues("siteProtectionUnits", this.getSiteProtectionUnits());
    }
    /**
     * Sets the siteInclusionRules property value. The rules associated with the SharePoint Protection policy.
     * @param value Value to set for the siteInclusionRules property.
     */
    public void setSiteInclusionRules(@jakarta.annotation.Nullable final java.util.List<SiteProtectionRule> value) {
        this.backingStore.set("siteInclusionRules", value);
    }
    /**
     * Sets the siteProtectionUnits property value. The protection units (sites) that are protected under the site protection policy.
     * @param value Value to set for the siteProtectionUnits property.
     */
    public void setSiteProtectionUnits(@jakarta.annotation.Nullable final java.util.List<SiteProtectionUnit> value) {
        this.backingStore.set("siteProtectionUnits", value);
    }
}
