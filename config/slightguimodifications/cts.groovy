// Here is the groovy file for screen elements
info("Hello From 'Slight' Gui Modifications cts script")

mainMenu {
    enabled = true // Set to true to enable this module

    splashText {
        enabled = true // Set to true to enable this module
        splashesEnabled = true // Set to false to disable splashes entirely

        customSplashes {
            enabled = true // Set to true to enable this module
            // You can put either "override" or "append" here to declare how you want to provide custom splashes
            applyMode = "override"
            defineCustom(["Wonderful weather we're having!", "Three big balls!", "Four big guys!", "2.71828182845904523536028747135!"])
        }
    }

    background {
        // clearBackgrounds() // This line removes the rotating cube
        backgroundStayLength = 10000 // This sets the length a background would stay
        backgroundFadeLength = 10000 // This sets the fade duration to another background
        renderGradientShade = false // This sets whether the slight shade should be rendered
        image {
            texture = file("config/slightguimodifications/background.png") // Remember to use forward slash to support unix!
            texture = resource("slightguimodifications:background.png") // Here to use a resource location / identifier
        }
    }

    // Uncomment these to remove aspects of the title screen
    removeMinecraftLogo()
    removeEditionBadge()

    // Clear all buttons already on screen
    clearAllButtons()

    label {
        position {
            x = 2
            y { it - 20 }
        }

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("Custom Version Here!")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Color of the text, default is 0xFFFFFF
        color = 0xFFFFFF
        // Whether the label has a shadow, default is false
        shadow = true
        // Mouse Hovered Color of the text, default is 0xFFFFFF
        hoveredColor = 0xFFFFFF
        // Mouse Click Function, default is nothing, here's a list of options
        onClicked = nothing()
        onClicked = url("https://www.google.com")
        onClicked = modMenu()
        onClicked = language()
        onClicked = options()
        onClicked = exit()
        onClicked = accessibility()
        onClicked = singleplayer()
        onClicked = multiplayer()
        onClicked = realms()
        onClicked = reloadCts()
    }

    button {
        position {
            x = 5
            y = 5
        }
        width = 200
        height = 20

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("Reload")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Mouse Click Function, default is nothing, look up see the list
        onClicked = reloadCts()
    }

    button {
        position {
            x = 5
            y = 100
        }
        width = 75
        height = 20

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("Singleplayer")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Mouse Click Function, default is nothing, look up see the list
        onClicked = singleplayer()
    }

    button {
        position {
            x = 5
            y = 120
        }
        width = 75
        height = 20

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("Multiplayer")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Mouse Click Function, default is nothing, look up see the list
        onClicked = multiplayer()
    }

    button {
        position {
            x = 5
            y = 140
        }
        width = 75
        height = 20

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("Settings")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Mouse Click Function, default is nothing, look up see the list
        onClicked = options()
    }

    button {
        position {
            x = 5
            y = 160
        }
        width = 75
        height = 20

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("Mods")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Mouse Click Function, default is nothing, look up see the list
        onClicked = modMenu()
    }

    button {
        position {
            x = 5
            y = 180
        }
        width = 75
        height = 20

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("eeeeee")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Mouse Click Function, default is nothing, look up see the list
        onClicked = url("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
    }
    
    button {
        position {
            x = 5
            y = 200
        }
        width = 75
        height = 20

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("Exit")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Mouse Click Function, default is nothing, look up see the list
        onClicked = exit()
    }
}