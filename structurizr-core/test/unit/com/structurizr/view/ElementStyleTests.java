package com.structurizr.view;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ElementStyleTests {

    @Test
    void setOpacity() {
        ElementStyle style = new ElementStyle();
        assertNull(style.getOpacity());

        style.setOpacity(-1);
        assertEquals(0, style.getOpacity().intValue());

        style.setOpacity(0);
        assertEquals(0, style.getOpacity().intValue());

        style.setOpacity(50);
        assertEquals(50, style.getOpacity().intValue());

        style.setOpacity(100);
        assertEquals(100, style.getOpacity().intValue());

        style.setOpacity(101);
        assertEquals(100, style.getOpacity().intValue());
    }

    @Test
    void opacity() {
        ElementStyle style = new ElementStyle();
        assertNull(style.getOpacity());

        style.opacity(-1);
        assertEquals(0, style.getOpacity().intValue());

        style.opacity(0);
        assertEquals(0, style.getOpacity().intValue());

        style.opacity(50);
        assertEquals(50, style.getOpacity().intValue());

        style.opacity(100);
        assertEquals(100, style.getOpacity().intValue());

        style.opacity(101);
        assertEquals(100, style.getOpacity().intValue());
    }

    @Test
    void setColor_SetsTheColorProperty_WhenAValidHexColorCodeIsSpecified() {
        ElementStyle style = new ElementStyle();
        style.setColor("#ffffff");
        assertEquals("#ffffff", style.getColor());

        style.setColor("#FFFFFF");
        assertEquals("#ffffff", style.getColor());

        style.setColor("#123456");
        assertEquals("#123456", style.getColor());
    }

    @Test
    void color_SetsTheColorProperty_WhenAValidHexColorCodeIsSpecified() {
        ElementStyle style = new ElementStyle();
        style.color("#ffffff");
        assertEquals("#ffffff", style.getColor());

        style.color("#FFFFFF");
        assertEquals("#ffffff", style.getColor());

        style.color("#123456");
        assertEquals("#123456", style.getColor());
    }

    @Test
    void setColor_ThrowsAnException_WhenAnInvalidHexColorCodeIsSpecified() {
        assertThrows(IllegalArgumentException.class, () -> {
            ElementStyle style = new ElementStyle();
            style.setColor("white");
        });
    }

    @Test
    void color_ThrowsAnException_WhenAnInvalidHexColorCodeIsSpecified() {
        assertThrows(IllegalArgumentException.class, () -> {
            ElementStyle style = new ElementStyle();
            style.color("white");
        });
    }

    @Test
    void setBackground_SetsTheBackgroundProperty_WhenAValidHexColorCodeIsSpecified() {
        ElementStyle style = new ElementStyle();
        style.setBackground("#ffffff");
        assertEquals("#ffffff", style.getBackground());

        style.setBackground("#FFFFFF");
        assertEquals("#ffffff", style.getBackground());

        style.setBackground("#123456");
        assertEquals("#123456", style.getBackground());
    }

    @Test
    void background_SetsTheBackgroundProperty_WhenAValidHexColorCodeIsSpecified() {
        ElementStyle style = new ElementStyle();
        style.background("#ffffff");
        assertEquals("#ffffff", style.getBackground());

        style.background("#FFFFFF");
        assertEquals("#ffffff", style.getBackground());

        style.background("#123456");
        assertEquals("#123456", style.getBackground());
    }

    @Test
    void setBackground_ThrowsAnException_WhenAnInvalidHexColorCodeIsSpecified() {
        assertThrows(IllegalArgumentException.class, () -> {
            ElementStyle style = new ElementStyle();
            style.setBackground("white");
        });
    }

    @Test
    void background_ThrowsAnException_WhenAnInvalidHexColorCodeIsSpecified() {
        assertThrows(IllegalArgumentException.class, () -> {
            ElementStyle style = new ElementStyle();
            style.background("white");
        });
    }

    @Test
    void setIcon_WithAUrl() {
        ElementStyle style = new ElementStyle();
        style.setIcon("https://structurizr.com/static/img/structurizr-logo.png");
        assertEquals("https://structurizr.com/static/img/structurizr-logo.png", style.getIcon());
    }

    @Test
    void setIcon_WithAUrlThatHasATrailingSpaceCharacter() {
        ElementStyle style = new ElementStyle();
        style.setIcon("https://structurizr.com/static/img/structurizr-logo.png ");
        assertEquals("https://structurizr.com/static/img/structurizr-logo.png", style.getIcon());
    }

    @Test
    void setIcon_WithADataUri() {
        ElementStyle style = new ElementStyle();
        style.setIcon("data:image/png;base64,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");
        assertEquals("data:image/png;base64,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", style.getIcon());
    }

    @Test
    void setIcon_ThrowsAnIllegalArgumentException_WhenAnInvalidUrlIsSpecified() {
        assertThrows(IllegalArgumentException.class, () -> {
            ElementStyle style = new ElementStyle();
            style.setIcon("htt://blah");
        });
    }

    @Test
    void setIcon_DoesNothing_WhenANullUrlIsSpecified() {
        ElementStyle style = new ElementStyle();
        style.setIcon(null);
        assertNull(style.getIcon());
    }

    @Test
    void setIcon_DoesNothing_WhenAnEmptyUrlIsSpecified() {
        ElementStyle style = new ElementStyle();
        style.setIcon(" ");
        assertNull(style.getIcon());
    }

    @Test
    void setStroke_SetsTheStrokeProperty_WhenAValidHexColorCodeIsSpecified() {
        ElementStyle style = new ElementStyle();
        style.setStroke("#ffffff");
        assertEquals("#ffffff", style.getStroke());

        style.setStroke("#FFFFFF");
        assertEquals("#ffffff", style.getStroke());

        style.setStroke("#123456");
        assertEquals("#123456", style.getStroke());
    }

    @Test
    void Stroke_SetsTheStrokeProperty_WhenAValidHexColorCodeIsSpecified() {
        ElementStyle style = new ElementStyle();
        style.stroke("#ffffff");
        assertEquals("#ffffff", style.getStroke());

        style.stroke("#FFFFFF");
        assertEquals("#ffffff", style.getStroke());

        style.stroke("#123456");
        assertEquals("#123456", style.getStroke());
    }

    @Test
    void setStroke_ThrowsAnException_WhenAnInvalidHexColorCodeIsSpecified() {
        assertThrows(IllegalArgumentException.class, () -> {
            ElementStyle style = new ElementStyle();
            style.setStroke("white");
        });
    }

    @Test
    void Stroke_ThrowsAnException_WhenAnInvalidHexColorCodeIsSpecified() {
        assertThrows(IllegalArgumentException.class, () -> {
            ElementStyle style = new ElementStyle();
            style.stroke("white");
        });
    }

    @Test
    void getProperties_ReturnsAnEmptyList_WhenNoPropertiesHaveBeenAdded() {
        ElementStyle style = new ElementStyle();
        assertEquals(0, style.getProperties().size());
    }

    @Test
    void addProperty_ThrowsAnException_WhenTheNameIsNull() {
        try {
            ElementStyle style = new ElementStyle();
            style.addProperty(null, "value");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A property name must be specified.", e.getMessage());
        }
    }

    @Test
    void addProperty_ThrowsAnException_WhenTheNameIsEmpty() {
        try {
            ElementStyle style = new ElementStyle();
            style.addProperty(" ", "value");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A property name must be specified.", e.getMessage());
        }
    }

    @Test
    void addProperty_ThrowsAnException_WhenTheValueIsNull() {
        try {
            ElementStyle style = new ElementStyle();
            style.addProperty("name", null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A property value must be specified.", e.getMessage());
        }
    }

    @Test
    void addProperty_ThrowsAnException_WhenTheValueIsEmpty() {
        try {
            ElementStyle style = new ElementStyle();
            style.addProperty("name", " ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A property value must be specified.", e.getMessage());
        }
    }

    @Test
    void addProperty_AddsTheProperty_WhenANameAndValueAreSpecified() {
        ElementStyle style = new ElementStyle();
        style.addProperty("name", "value");
        assertEquals("value", style.getProperties().get("name"));
    }

    @Test
    void setProperties_DoesNothing_WhenNullIsSpecified() {
        ElementStyle style = new ElementStyle();
        style.setProperties(null);
        assertEquals(0, style.getProperties().size());
    }

    @Test
    void setProperties_SetsTheProperties_WhenANonEmptyMapIsSpecified() {
        ElementStyle style = new ElementStyle();
        Map<String, String> properties = new HashMap<>();
        properties.put("name", "value");
        style.setProperties(properties);
        assertEquals(1, style.getProperties().size());
        assertEquals("value", style.getProperties().get("name"));
    }

}