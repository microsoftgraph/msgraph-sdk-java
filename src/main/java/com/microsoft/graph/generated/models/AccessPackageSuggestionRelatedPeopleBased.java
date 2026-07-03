package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageSuggestionRelatedPeopleBased extends AccessPackageSuggestionReason implements Parsable {
    /**
     * Instantiates a new {@link AccessPackageSuggestionRelatedPeopleBased} and sets the default values.
     */
    public AccessPackageSuggestionRelatedPeopleBased() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageSuggestionRelatedPeopleBased");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageSuggestionRelatedPeopleBased}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageSuggestionRelatedPeopleBased createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageSuggestionRelatedPeopleBased();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("relatedPeople", (n) -> { this.setRelatedPeople(n.getCollectionOfObjectValues(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("relatedPeopleAssignmentCount", (n) -> { this.setRelatedPeopleAssignmentCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the relatedPeople property value. A collection of identities representing people related to the current user who may have access to similar resources. This property is only populated when the tenant&apos;s endUserSettings have relatedPeopleInsightLevel set to countAndNames. This includes both the user ID and display name information.
     * @return a {@link java.util.List<Identity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Identity> getRelatedPeople() {
        return this.backingStore.get("relatedPeople");
    }
    /**
     * Gets the relatedPeopleAssignmentCount property value. The number of related people who have assignments to this access package. This count is always provided regardless of the relatedPeopleInsightLevel setting.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRelatedPeopleAssignmentCount() {
        return this.backingStore.get("relatedPeopleAssignmentCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("relatedPeople", this.getRelatedPeople());
        writer.writeIntegerValue("relatedPeopleAssignmentCount", this.getRelatedPeopleAssignmentCount());
    }
    /**
     * Sets the relatedPeople property value. A collection of identities representing people related to the current user who may have access to similar resources. This property is only populated when the tenant&apos;s endUserSettings have relatedPeopleInsightLevel set to countAndNames. This includes both the user ID and display name information.
     * @param value Value to set for the relatedPeople property.
     */
    public void setRelatedPeople(@jakarta.annotation.Nullable final java.util.List<Identity> value) {
        this.backingStore.set("relatedPeople", value);
    }
    /**
     * Sets the relatedPeopleAssignmentCount property value. The number of related people who have assignments to this access package. This count is always provided regardless of the relatedPeopleInsightLevel setting.
     * @param value Value to set for the relatedPeopleAssignmentCount property.
     */
    public void setRelatedPeopleAssignmentCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("relatedPeopleAssignmentCount", value);
    }
}
