package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfficeGraphInsights extends Entity implements Parsable {
    /** Access this property from the derived type itemInsights.  */
    private java.util.List<SharedInsight> _shared;
    /** Access this property from the derived type itemInsights.  */
    private java.util.List<Trending> _trending;
    /** Access this property from the derived type itemInsights.  */
    private java.util.List<UsedInsight> _used;
    /**
     * Instantiates a new officeGraphInsights and sets the default values.
     * @return a void
     */
    public OfficeGraphInsights() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a officeGraphInsights
     */
    @javax.annotation.Nonnull
    public static OfficeGraphInsights createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfficeGraphInsights();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OfficeGraphInsights currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("shared", (n) -> { currentObject.setShared(n.getCollectionOfObjectValues(SharedInsight::createFromDiscriminatorValue)); });
            this.put("trending", (n) -> { currentObject.setTrending(n.getCollectionOfObjectValues(Trending::createFromDiscriminatorValue)); });
            this.put("used", (n) -> { currentObject.setUsed(n.getCollectionOfObjectValues(UsedInsight::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the shared property value. Access this property from the derived type itemInsights.
     * @return a sharedInsight
     */
    @javax.annotation.Nullable
    public java.util.List<SharedInsight> getShared() {
        return this._shared;
    }
    /**
     * Gets the trending property value. Access this property from the derived type itemInsights.
     * @return a trending
     */
    @javax.annotation.Nullable
    public java.util.List<Trending> getTrending() {
        return this._trending;
    }
    /**
     * Gets the used property value. Access this property from the derived type itemInsights.
     * @return a usedInsight
     */
    @javax.annotation.Nullable
    public java.util.List<UsedInsight> getUsed() {
        return this._used;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("shared", this.getShared());
        writer.writeCollectionOfObjectValues("trending", this.getTrending());
        writer.writeCollectionOfObjectValues("used", this.getUsed());
    }
    /**
     * Sets the shared property value. Access this property from the derived type itemInsights.
     * @param value Value to set for the shared property.
     * @return a void
     */
    public void setShared(@javax.annotation.Nullable final java.util.List<SharedInsight> value) {
        this._shared = value;
    }
    /**
     * Sets the trending property value. Access this property from the derived type itemInsights.
     * @param value Value to set for the trending property.
     * @return a void
     */
    public void setTrending(@javax.annotation.Nullable final java.util.List<Trending> value) {
        this._trending = value;
    }
    /**
     * Sets the used property value. Access this property from the derived type itemInsights.
     * @param value Value to set for the used property.
     * @return a void
     */
    public void setUsed(@javax.annotation.Nullable final java.util.List<UsedInsight> value) {
        this._used = value;
    }
}
