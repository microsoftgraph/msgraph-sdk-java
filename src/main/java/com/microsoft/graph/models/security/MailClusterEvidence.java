package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MailClusterEvidence extends AlertEvidence implements Parsable {
    /** The clusterBy property */
    private String _clusterBy;
    /** The clusterByValue property */
    private String _clusterByValue;
    /** The emailCount property */
    private Long _emailCount;
    /** The networkMessageIds property */
    private java.util.List<String> _networkMessageIds;
    /** The query property */
    private String _query;
    /** The urn property */
    private String _urn;
    /**
     * Instantiates a new MailClusterEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MailClusterEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MailClusterEvidence
     */
    @javax.annotation.Nonnull
    public static MailClusterEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailClusterEvidence();
    }
    /**
     * Gets the clusterBy property value. The clusterBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterBy() {
        return this._clusterBy;
    }
    /**
     * Gets the clusterByValue property value. The clusterByValue property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClusterByValue() {
        return this._clusterByValue;
    }
    /**
     * Gets the emailCount property value. The emailCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getEmailCount() {
        return this._emailCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clusterBy", (n) -> { this.setClusterBy(n.getStringValue()); });
        deserializerMap.put("clusterByValue", (n) -> { this.setClusterByValue(n.getStringValue()); });
        deserializerMap.put("emailCount", (n) -> { this.setEmailCount(n.getLongValue()); });
        deserializerMap.put("networkMessageIds", (n) -> { this.setNetworkMessageIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        deserializerMap.put("urn", (n) -> { this.setUrn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the networkMessageIds property value. The networkMessageIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNetworkMessageIds() {
        return this._networkMessageIds;
    }
    /**
     * Gets the query property value. The query property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuery() {
        return this._query;
    }
    /**
     * Gets the urn property value. The urn property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrn() {
        return this._urn;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("clusterBy", this.getClusterBy());
        writer.writeStringValue("clusterByValue", this.getClusterByValue());
        writer.writeLongValue("emailCount", this.getEmailCount());
        writer.writeCollectionOfPrimitiveValues("networkMessageIds", this.getNetworkMessageIds());
        writer.writeStringValue("query", this.getQuery());
        writer.writeStringValue("urn", this.getUrn());
    }
    /**
     * Sets the clusterBy property value. The clusterBy property
     * @param value Value to set for the clusterBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterBy(@javax.annotation.Nullable final String value) {
        this._clusterBy = value;
    }
    /**
     * Sets the clusterByValue property value. The clusterByValue property
     * @param value Value to set for the clusterByValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClusterByValue(@javax.annotation.Nullable final String value) {
        this._clusterByValue = value;
    }
    /**
     * Sets the emailCount property value. The emailCount property
     * @param value Value to set for the emailCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailCount(@javax.annotation.Nullable final Long value) {
        this._emailCount = value;
    }
    /**
     * Sets the networkMessageIds property value. The networkMessageIds property
     * @param value Value to set for the networkMessageIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkMessageIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._networkMessageIds = value;
    }
    /**
     * Sets the query property value. The query property
     * @param value Value to set for the query property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuery(@javax.annotation.Nullable final String value) {
        this._query = value;
    }
    /**
     * Sets the urn property value. The urn property
     * @param value Value to set for the urn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrn(@javax.annotation.Nullable final String value) {
        this._urn = value;
    }
}
