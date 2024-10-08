package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
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
public class WorkbookChart extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookChart} and sets the default values.
     */
    public WorkbookChart() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookChart}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChart createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChart();
    }
    /**
     * Gets the axes property value. Represents chart axes. Read-only.
     * @return a {@link WorkbookChartAxes}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartAxes getAxes() {
        return this.backingStore.get("axes");
    }
    /**
     * Gets the dataLabels property value. Represents the data labels on the chart. Read-only.
     * @return a {@link WorkbookChartDataLabels}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartDataLabels getDataLabels() {
        return this.backingStore.get("dataLabels");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("axes", (n) -> { this.setAxes(n.getObjectValue(WorkbookChartAxes::createFromDiscriminatorValue)); });
        deserializerMap.put("dataLabels", (n) -> { this.setDataLabels(n.getObjectValue(WorkbookChartDataLabels::createFromDiscriminatorValue)); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookChartAreaFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getObjectValue(WorkbookChartHeight::createFromDiscriminatorValue)); });
        deserializerMap.put("left", (n) -> { this.setLeft(n.getObjectValue(WorkbookChartLeft::createFromDiscriminatorValue)); });
        deserializerMap.put("legend", (n) -> { this.setLegend(n.getObjectValue(WorkbookChartLegend::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("series", (n) -> { this.setSeries(n.getCollectionOfObjectValues(WorkbookChartSeries::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getObjectValue(WorkbookChartTitle::createFromDiscriminatorValue)); });
        deserializerMap.put("top", (n) -> { this.setTop(n.getObjectValue(WorkbookChartTop::createFromDiscriminatorValue)); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getObjectValue(WorkbookChartWidth::createFromDiscriminatorValue)); });
        deserializerMap.put("worksheet", (n) -> { this.setWorksheet(n.getObjectValue(WorkbookWorksheet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Encapsulates the format properties for the chart area. Read-only.
     * @return a {@link WorkbookChartAreaFormat}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartAreaFormat getFormat() {
        return this.backingStore.get("format");
    }
    /**
     * Gets the height property value. Represents the height, in points, of the chart object.
     * @return a {@link WorkbookChartHeight}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartHeight getHeight() {
        return this.backingStore.get("height");
    }
    /**
     * Gets the left property value. The distance, in points, from the left side of the chart to the worksheet origin.
     * @return a {@link WorkbookChartLeft}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartLeft getLeft() {
        return this.backingStore.get("left");
    }
    /**
     * Gets the legend property value. Represents the legend for the chart. Read-only.
     * @return a {@link WorkbookChartLegend}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartLegend getLegend() {
        return this.backingStore.get("legend");
    }
    /**
     * Gets the name property value. Represents the name of a chart object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the series property value. Represents either a single series or collection of series in the chart. Read-only.
     * @return a {@link java.util.List<WorkbookChartSeries>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookChartSeries> getSeries() {
        return this.backingStore.get("series");
    }
    /**
     * Gets the title property value. Represents the title of the specified chart, including the text, visibility, position and formatting of the title. Read-only.
     * @return a {@link WorkbookChartTitle}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartTitle getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Gets the top property value. Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
     * @return a {@link WorkbookChartTop}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartTop getTop() {
        return this.backingStore.get("top");
    }
    /**
     * Gets the width property value. Represents the width, in points, of the chart object.
     * @return a {@link WorkbookChartWidth}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartWidth getWidth() {
        return this.backingStore.get("width");
    }
    /**
     * Gets the worksheet property value. The worksheet containing the current chart. Read-only.
     * @return a {@link WorkbookWorksheet}
     */
    @jakarta.annotation.Nullable
    public WorkbookWorksheet getWorksheet() {
        return this.backingStore.get("worksheet");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("axes", this.getAxes());
        writer.writeObjectValue("dataLabels", this.getDataLabels());
        writer.writeObjectValue("format", this.getFormat());
        writer.writeObjectValue("height", this.getHeight());
        writer.writeObjectValue("left", this.getLeft());
        writer.writeObjectValue("legend", this.getLegend());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("series", this.getSeries());
        writer.writeObjectValue("title", this.getTitle());
        writer.writeObjectValue("top", this.getTop());
        writer.writeObjectValue("width", this.getWidth());
        writer.writeObjectValue("worksheet", this.getWorksheet());
    }
    /**
     * Sets the axes property value. Represents chart axes. Read-only.
     * @param value Value to set for the axes property.
     */
    public void setAxes(@jakarta.annotation.Nullable final WorkbookChartAxes value) {
        this.backingStore.set("axes", value);
    }
    /**
     * Sets the dataLabels property value. Represents the data labels on the chart. Read-only.
     * @param value Value to set for the dataLabels property.
     */
    public void setDataLabels(@jakarta.annotation.Nullable final WorkbookChartDataLabels value) {
        this.backingStore.set("dataLabels", value);
    }
    /**
     * Sets the format property value. Encapsulates the format properties for the chart area. Read-only.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final WorkbookChartAreaFormat value) {
        this.backingStore.set("format", value);
    }
    /**
     * Sets the height property value. Represents the height, in points, of the chart object.
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final WorkbookChartHeight value) {
        this.backingStore.set("height", value);
    }
    /**
     * Sets the left property value. The distance, in points, from the left side of the chart to the worksheet origin.
     * @param value Value to set for the left property.
     */
    public void setLeft(@jakarta.annotation.Nullable final WorkbookChartLeft value) {
        this.backingStore.set("left", value);
    }
    /**
     * Sets the legend property value. Represents the legend for the chart. Read-only.
     * @param value Value to set for the legend property.
     */
    public void setLegend(@jakarta.annotation.Nullable final WorkbookChartLegend value) {
        this.backingStore.set("legend", value);
    }
    /**
     * Sets the name property value. Represents the name of a chart object.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the series property value. Represents either a single series or collection of series in the chart. Read-only.
     * @param value Value to set for the series property.
     */
    public void setSeries(@jakarta.annotation.Nullable final java.util.List<WorkbookChartSeries> value) {
        this.backingStore.set("series", value);
    }
    /**
     * Sets the title property value. Represents the title of the specified chart, including the text, visibility, position and formatting of the title. Read-only.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final WorkbookChartTitle value) {
        this.backingStore.set("title", value);
    }
    /**
     * Sets the top property value. Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
     * @param value Value to set for the top property.
     */
    public void setTop(@jakarta.annotation.Nullable final WorkbookChartTop value) {
        this.backingStore.set("top", value);
    }
    /**
     * Sets the width property value. Represents the width, in points, of the chart object.
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final WorkbookChartWidth value) {
        this.backingStore.set("width", value);
    }
    /**
     * Sets the worksheet property value. The worksheet containing the current chart. Read-only.
     * @param value Value to set for the worksheet property.
     */
    public void setWorksheet(@jakarta.annotation.Nullable final WorkbookWorksheet value) {
        this.backingStore.set("worksheet", value);
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class WorkbookChartHeight implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link WorkbookChartHeight} and sets the default values.
         */
        public WorkbookChartHeight() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link WorkbookChartHeight}
         */
        @jakarta.annotation.Nonnull
        public static WorkbookChartHeight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final WorkbookChartHeight result = new WorkbookChartHeight();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
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
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
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
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class WorkbookChartLeft implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link WorkbookChartLeft} and sets the default values.
         */
        public WorkbookChartLeft() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link WorkbookChartLeft}
         */
        @jakarta.annotation.Nonnull
        public static WorkbookChartLeft createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final WorkbookChartLeft result = new WorkbookChartLeft();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
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
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
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
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class WorkbookChartTop implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link WorkbookChartTop} and sets the default values.
         */
        public WorkbookChartTop() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link WorkbookChartTop}
         */
        @jakarta.annotation.Nonnull
        public static WorkbookChartTop createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final WorkbookChartTop result = new WorkbookChartTop();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
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
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
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
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class WorkbookChartWidth implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link WorkbookChartWidth} and sets the default values.
         */
        public WorkbookChartWidth() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link WorkbookChartWidth}
         */
        @jakarta.annotation.Nonnull
        public static WorkbookChartWidth createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final WorkbookChartWidth result = new WorkbookChartWidth();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
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
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
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
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
}
