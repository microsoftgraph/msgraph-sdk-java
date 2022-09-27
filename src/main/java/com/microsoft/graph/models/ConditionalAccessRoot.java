package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessRoot extends Entity implements Parsable {
    /** The authenticationContextClassReferences property */
    private java.util.List<AuthenticationContextClassReference> _authenticationContextClassReferences;
    /** Read-only. Nullable. Returns a collection of the specified named locations. */
    private java.util.List<NamedLocation> _namedLocations;
    /** Read-only. Nullable. Returns a collection of the specified Conditional Access (CA) policies. */
    private java.util.List<ConditionalAccessPolicy> _policies;
    /**
     * Instantiates a new conditionalAccessRoot and sets the default values.
     * @return a void
     */
    public ConditionalAccessRoot() {
        super();
        this.setOdataType("#microsoft.graph.conditionalAccessRoot");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessRoot
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessRoot();
    }
    /**
     * Gets the authenticationContextClassReferences property value. The authenticationContextClassReferences property
     * @return a authenticationContextClassReference
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationContextClassReference> getAuthenticationContextClassReferences() {
        return this._authenticationContextClassReferences;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessRoot currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("authenticationContextClassReferences", (n) -> { currentObject.setAuthenticationContextClassReferences(n.getCollectionOfObjectValues(AuthenticationContextClassReference::createFromDiscriminatorValue)); });
            this.put("namedLocations", (n) -> { currentObject.setNamedLocations(n.getCollectionOfObjectValues(NamedLocation::createFromDiscriminatorValue)); });
            this.put("policies", (n) -> { currentObject.setPolicies(n.getCollectionOfObjectValues(ConditionalAccessPolicy::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the namedLocations property value. Read-only. Nullable. Returns a collection of the specified named locations.
     * @return a namedLocation
     */
    @javax.annotation.Nullable
    public java.util.List<NamedLocation> getNamedLocations() {
        return this._namedLocations;
    }
    /**
     * Gets the policies property value. Read-only. Nullable. Returns a collection of the specified Conditional Access (CA) policies.
     * @return a conditionalAccessPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ConditionalAccessPolicy> getPolicies() {
        return this._policies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("authenticationContextClassReferences", this.getAuthenticationContextClassReferences());
        writer.writeCollectionOfObjectValues("namedLocations", this.getNamedLocations());
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
    }
    /**
     * Sets the authenticationContextClassReferences property value. The authenticationContextClassReferences property
     * @param value Value to set for the authenticationContextClassReferences property.
     * @return a void
     */
    public void setAuthenticationContextClassReferences(@javax.annotation.Nullable final java.util.List<AuthenticationContextClassReference> value) {
        this._authenticationContextClassReferences = value;
    }
    /**
     * Sets the namedLocations property value. Read-only. Nullable. Returns a collection of the specified named locations.
     * @param value Value to set for the namedLocations property.
     * @return a void
     */
    public void setNamedLocations(@javax.annotation.Nullable final java.util.List<NamedLocation> value) {
        this._namedLocations = value;
    }
    /**
     * Sets the policies property value. Read-only. Nullable. Returns a collection of the specified Conditional Access (CA) policies.
     * @param value Value to set for the policies property.
     * @return a void
     */
    public void setPolicies(@javax.annotation.Nullable final java.util.List<ConditionalAccessPolicy> value) {
        this._policies = value;
    }
}
