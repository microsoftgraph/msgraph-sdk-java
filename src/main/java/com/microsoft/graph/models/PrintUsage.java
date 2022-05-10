package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintUsage extends Entity implements Parsable {
    /** The completedBlackAndWhiteJobCount property */
    private Long _completedBlackAndWhiteJobCount;
    /** The completedColorJobCount property */
    private Long _completedColorJobCount;
    /** The incompleteJobCount property */
    private Long _incompleteJobCount;
    /** The usageDate property */
    private LocalDate _usageDate;
    /**
     * Instantiates a new printUsage and sets the default values.
     * @return a void
     */
    public PrintUsage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printUsage
     */
    @javax.annotation.Nonnull
    public static PrintUsage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintUsage();
    }
    /**
     * Gets the completedBlackAndWhiteJobCount property value. The completedBlackAndWhiteJobCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCompletedBlackAndWhiteJobCount() {
        return this._completedBlackAndWhiteJobCount;
    }
    /**
     * Gets the completedColorJobCount property value. The completedColorJobCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCompletedColorJobCount() {
        return this._completedColorJobCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrintUsage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("completedBlackAndWhiteJobCount", (n) -> { currentObject.setCompletedBlackAndWhiteJobCount(n.getLongValue()); });
            this.put("completedColorJobCount", (n) -> { currentObject.setCompletedColorJobCount(n.getLongValue()); });
            this.put("incompleteJobCount", (n) -> { currentObject.setIncompleteJobCount(n.getLongValue()); });
            this.put("usageDate", (n) -> { currentObject.setUsageDate(n.getLocalDateValue()); });
        }};
    }
    /**
     * Gets the incompleteJobCount property value. The incompleteJobCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getIncompleteJobCount() {
        return this._incompleteJobCount;
    }
    /**
     * Gets the usageDate property value. The usageDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getUsageDate() {
        return this._usageDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("completedBlackAndWhiteJobCount", this.getCompletedBlackAndWhiteJobCount());
        writer.writeLongValue("completedColorJobCount", this.getCompletedColorJobCount());
        writer.writeLongValue("incompleteJobCount", this.getIncompleteJobCount());
        writer.writeLocalDateValue("usageDate", this.getUsageDate());
    }
    /**
     * Sets the completedBlackAndWhiteJobCount property value. The completedBlackAndWhiteJobCount property
     * @param value Value to set for the completedBlackAndWhiteJobCount property.
     * @return a void
     */
    public void setCompletedBlackAndWhiteJobCount(@javax.annotation.Nullable final Long value) {
        this._completedBlackAndWhiteJobCount = value;
    }
    /**
     * Sets the completedColorJobCount property value. The completedColorJobCount property
     * @param value Value to set for the completedColorJobCount property.
     * @return a void
     */
    public void setCompletedColorJobCount(@javax.annotation.Nullable final Long value) {
        this._completedColorJobCount = value;
    }
    /**
     * Sets the incompleteJobCount property value. The incompleteJobCount property
     * @param value Value to set for the incompleteJobCount property.
     * @return a void
     */
    public void setIncompleteJobCount(@javax.annotation.Nullable final Long value) {
        this._incompleteJobCount = value;
    }
    /**
     * Sets the usageDate property value. The usageDate property
     * @param value Value to set for the usageDate property.
     * @return a void
     */
    public void setUsageDate(@javax.annotation.Nullable final LocalDate value) {
        this._usageDate = value;
    }
}
