package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GitHubRepoEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link GitHubRepoEvidence} and sets the default values.
     */
    public GitHubRepoEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.gitHubRepoEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GitHubRepoEvidence}
     */
    @jakarta.annotation.Nonnull
    public static GitHubRepoEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GitHubRepoEvidence();
    }
    /**
     * Gets the baseUrl property value. The baseUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBaseUrl() {
        return this.backingStore.get("baseUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("baseUrl", (n) -> { this.setBaseUrl(n.getStringValue()); });
        deserializerMap.put("login", (n) -> { this.setLogin(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("ownerType", (n) -> { this.setOwnerType(n.getStringValue()); });
        deserializerMap.put("repoId", (n) -> { this.setRepoId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the login property value. The login property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLogin() {
        return this.backingStore.get("login");
    }
    /**
     * Gets the owner property value. The owner property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwner() {
        return this.backingStore.get("owner");
    }
    /**
     * Gets the ownerType property value. The ownerType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnerType() {
        return this.backingStore.get("ownerType");
    }
    /**
     * Gets the repoId property value. The repoId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRepoId() {
        return this.backingStore.get("repoId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("baseUrl", this.getBaseUrl());
        writer.writeStringValue("login", this.getLogin());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeStringValue("ownerType", this.getOwnerType());
        writer.writeStringValue("repoId", this.getRepoId());
    }
    /**
     * Sets the baseUrl property value. The baseUrl property
     * @param value Value to set for the baseUrl property.
     */
    public void setBaseUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("baseUrl", value);
    }
    /**
     * Sets the login property value. The login property
     * @param value Value to set for the login property.
     */
    public void setLogin(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("login", value);
    }
    /**
     * Sets the owner property value. The owner property
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("owner", value);
    }
    /**
     * Sets the ownerType property value. The ownerType property
     * @param value Value to set for the ownerType property.
     */
    public void setOwnerType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerType", value);
    }
    /**
     * Sets the repoId property value. The repoId property
     * @param value Value to set for the repoId property.
     */
    public void setRepoId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("repoId", value);
    }
}
