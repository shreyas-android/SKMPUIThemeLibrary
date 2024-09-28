package com.androidai.framework.feature.sandroid.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalMinimumInteractiveComponentEnforcement
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.androidai.framework.theme.sandroid.ui.SAndroidUITheme
import com.androidai.framework.theme.sandroid.ui.Mode
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIColorCodes
import com.androidai.framework.theme.sandroid.ui.thememanager.SAndroidUIThemeManager
import com.google.android.material.color.DynamicColors

@Composable
fun SAndroidAppearanceScreen(themeManager : SAndroidUIThemeManager,
                             title : String = stringResource(R.string.title_appearance),
                             canShowBackButton : Boolean = false, canShowDynamicColor:Boolean = true,
                             actionColorList : List<Color> = listOf(SAndroidUIColorCodes.ColorActionViolet,
    SAndroidUIColorCodes.ColorActionPink)){
    SAndroidUITheme(themeManager = themeManager) {
        AppearanceScreen(
            title = title, canShowBackButton = canShowBackButton, canShowDynamicColor = canShowDynamicColor,
            selectedActionColor = themeManager.getActionColorFlow().collectAsState().value,
            isDynamicModeEnabled = themeManager.getDynamicThemeEnabledFlow().collectAsState().value,
            selectedMode = themeManager.getModeFlow().collectAsState().value,
            actionColorList = actionColorList,
            onBackPressed = { }, onDayNightModeChanged = {
                themeManager.onModeChanged(it)
            }, onActionColorModeChanged = {
                themeManager.onActionColorChanged(it)
            }, onDynamicThemeCheckChanged = {
                themeManager.onDynamicThemeModeChanged(it)
            })
    }
}

@Composable
fun AppearanceScreen(
        title : String = stringResource(R.string.title_appearance),
        canShowBackButton : Boolean = false, canShowDynamicColor:Boolean = false, selectedMode : Mode = Mode.SYSTEM_DEFAULT,
        selectedActionColor : Color, actionColorList : List<Color>,
        isDynamicModeEnabled : Boolean = false, onBackPressed : () -> Unit,
        onDayNightModeChanged : (Mode) -> Unit, onActionColorModeChanged : (Color) -> Unit,
        onDynamicThemeCheckChanged : (Boolean) -> Unit) {

    BackHandler {
        onBackPressed()
    }



    Scaffold(
        backgroundColor = SAndroidUITheme.colors.sAndroidUIBackgroundColors.backgroundColor,
        modifier = Modifier,
        topBar = {
            AppearanceTopAppBar(title, canShowBackButton) {
                onBackPressed()
            }
        },
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(vertical = 16.dp)) {
            NormalCard(SAndroidUITheme.colors.sAndroidUIBackgroundColors.cardBackgroundColor) {
                Row(modifier = Modifier.padding(horizontal = 8.dp)) {
                    ThemeItem(modifier = Modifier.weight(1f), themeType = Mode.LIGHT,
                        isSelected = Mode.LIGHT == selectedMode, onThemeSelected = {
                            onDayNightModeChanged(it)
                        })

                    ThemeItem(modifier = Modifier.weight(1f), themeType = Mode.DARK,
                        isSelected = Mode.DARK == selectedMode, onThemeSelected = {
                            onDayNightModeChanged(it)
                        })


                    ThemeItem(modifier = Modifier.weight(1f), themeType = Mode.SYSTEM_DEFAULT,
                        isSelected = Mode.SYSTEM_DEFAULT == selectedMode, onThemeSelected = {
                            onDayNightModeChanged(it)
                        })

                }
            }

            Header(headerText = stringResource(R.string.title_action_color))

            NormalCard(SAndroidUITheme.colors.sAndroidUIBackgroundColors.cardBackgroundColor) {

                val itemSize = 36.dp

                val alpha = if(!isDynamicModeEnabled) {
                    1f
                } else {
                    0.5f
                }

                val maxCount = if(actionColorList.size <= 5) {
                    actionColorList.size
                } else {
                    5
                }
                EqualSpaceFlowLayout(
                    Modifier.alpha(alpha), itemSize, maxCount,
                    actionColorList) { color, _, padding ->

                    Box(contentAlignment = Alignment.Center,
                        modifier = Modifier.padding(vertical = 16.dp, horizontal = padding)
                            .background(
                                color = color, shape = CircleShape).clip(CircleShape)
                            .rippleClickable(enabled = !isDynamicModeEnabled) {
                                onActionColorModeChanged(color)
                            }.size(itemSize).padding(6.dp)

                    ) {
                        if(color == selectedActionColor) {
                            Icon(
                                modifier = Modifier,
                                painter = painterResource(id = R.drawable.ic_tick),
                                contentDescription = "", tint = Color.White)
                        }
                    }
                }
            }

            if(DynamicColors.isDynamicColorAvailable() && canShowDynamicColor) {
                NormalCard(SAndroidUITheme.colors.sAndroidUIBackgroundColors.cardBackgroundColor) {
                    SettingsSwitch(
                        switchText = stringResource(R.string.title_use_dynamic_theme),
                        isChecked = isDynamicModeEnabled) {
                        onDynamicThemeCheckChanged(it)

                    }
                }
            }
        }
    }
}

@Composable
private fun AppearanceTopAppBar(
        title : String, canShowBackButton : Boolean, onBackButtonClicked : () -> Unit) {
    val topAppBarColor = SAndroidUITheme.colors.sAndroidUIBackgroundColors.topAppBarColor
    val topAppBarElevation =
        if(SAndroidUITheme.colors.sAndroidUIBackgroundColors.backgroundColor == topAppBarColor) {
            0.dp
        } else {
            2.dp
        }
    Surface(elevation = topAppBarElevation) {
        TopAppBar(elevation = 0.dp,
            modifier = Modifier
                .fillMaxWidth()
                .background(topAppBarColor)
                .statusBarsPadding(),
            backgroundColor = topAppBarColor, title = {
                Text(
                    text = title,
                    style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Medium),
                    color = SAndroidUITheme.colors.sAndroidUITextColors.topAppBarTextColor)
            }, navigationIcon = if(canShowBackButton) {
                {
                    IconButton(modifier = Modifier, onClick = { onBackButtonClicked() }) {
                        Icon(
                            Icons.Filled.ArrowBack, contentDescription = "Back button",
                            tint = SAndroidUITheme.colors.sAndroidUIIconColors.iconColor)
                    }
                }
            } else {
                null
            })

    }

}

@Composable
fun ThemeItem(
        modifier : Modifier, themeType : Mode, isSelected : Boolean,
        onThemeSelected : (Mode) -> Unit) {

    val imageResId = when(themeType) {
        Mode.LIGHT -> {
            R.drawable.theme_light
        }

        Mode.DARK -> {
            R.drawable.theme_dark
        }

        else -> {
            R.drawable.theme_system
        }
    }
    Column(modifier = modifier
        .nonRippleClickable {
            onThemeSelected(themeType)
        }
        .padding(vertical = 16.dp, horizontal = 8.dp), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Box(modifier = Modifier
            .width(90.dp)
            .height(156.dp), contentAlignment = Alignment.Center) {

            Image(painterResource(id = imageResId), contentDescription = getThemeName(themeType))
            if(isSelected) {
                Spacer(
                    modifier = Modifier
                        .width(90.dp)
                        .padding(
                            start = 8.dp, top = 7.dp, end = 12.dp, bottom = 12.dp)
                        .height(156.dp)
                        .border(
                            width = 2.dp,
                            color = SAndroidUITheme.colors.sAndroidUIOtherColors.accentColor,
                            shape = RoundedCornerShape(13.dp)))
            }
        }

        Text(
            text = getThemeName(themeType),
            color = SAndroidUITheme.colors.sAndroidUITextColors.primaryTextColor,
            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal),
        )

        RadioButton(modifier = Modifier, selected = isSelected, colors = RadioButtonDefaults.colors(
            selectedColor = SAndroidUITheme.colors.sAndroidUIOtherColors.radioSelectedColor,
            unselectedColor = SAndroidUITheme.colors.sAndroidUIOtherColors.radioUnSelectedColor,
        ), onClick = {
            onThemeSelected(themeType)
        })
    }
}

@Composable
fun NormalCard(backgroundColor : Color, content : @Composable () -> Unit) {
        Card(
            backgroundColor = backgroundColor, modifier = Modifier
                .padding(
                    horizontal = 16.dp, vertical = 16.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)) {
            Column(modifier = Modifier.padding(vertical = 6.dp)) {
                content()
            }
        }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun <T> EqualSpaceFlowLayout(
        modifier : Modifier, itemSize : Dp, maxCount : Int, items : List<T>,
        itemContent : @Composable (T, Int, Dp) -> Unit) {


    BoxWithConstraints(modifier = modifier) {
        val width = constraints.maxWidth
        with(LocalDensity.current) {

            val remainingWidth = (width - (itemSize.toPx() * maxCount))
            val horizontalSpacing = ((remainingWidth / maxCount)/2).toDp() - 0.1.dp

            FlowRow(maxItemsInEachRow = maxCount) {
                for(i in items.indices) {
                    itemContent(items[i], i, horizontalSpacing)
                }
            }
        }
    }
}

fun Modifier.nonRippleClickable(
        shouldClearFocus : Boolean = true, onClick : (() -> Unit)? = null) : Modifier =
    composed {
        val focusManager = LocalFocusManager.current
        clickable(indication = null, interactionSource = remember { MutableInteractionSource() }) {
            if(shouldClearFocus) {
                focusManager.clearFocus()
            }
            onClick?.invoke()
        }

    }

@Composable
fun getThemeName(themeType : Mode) : String {
    return when(themeType) {
        Mode.LIGHT -> {
            stringResource(R.string.title_theme_light)
        }

        Mode.DARK -> {
            stringResource(R.string.title_theme_dark)
        }

        else -> {
            stringResource(R.string.title_theme_system_default)
        }

    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SettingsSwitch(
        switchText : String, switchDescription : String = "", isChecked : Boolean,
        onCheckedChange : (Boolean) -> Unit) {
    CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
        var modifier = Modifier
            .rippleClickable {
                onCheckedChange(!isChecked)
            }
            .fillMaxWidth()

        modifier = if(switchDescription.isNotEmpty()) {
            modifier.padding(horizontal = 16.dp, vertical = 12.dp)
        } else {
            modifier.padding(horizontal = 16.dp, vertical = 6.dp)
        }

        ConstraintLayout(modifier = modifier) {
            val (text, description, switch) = createRefs()

            val titleModifier = if(switchDescription.isNotEmpty()) {
                Modifier.constrainAs(text) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    end.linkTo(switch.start)
                    width = Dimension.fillToConstraints
                }
            } else {
                Modifier.constrainAs(text) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    end.linkTo(switch.start)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                }
            }
            Text(
                modifier = titleModifier, text = switchText,
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal),
                color = SAndroidUITheme.colors.sAndroidUITextColors.primaryTextColor)

            if(switchDescription.isNotEmpty()) {
                Text(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .constrainAs(description) {
                            start.linkTo(parent.start)
                            top.linkTo(text.bottom)
                            end.linkTo(switch.start)
                            width = Dimension.fillToConstraints
                        }, text = switchDescription,
                    style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Medium),
                    color = SAndroidUITheme.colors.sAndroidUITextColors.secondaryTextColor,
                    lineHeight = 20.sp)
            }

            Switch(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .constrainAs(switch) {
                        top.linkTo(parent.top)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                    }, checked = isChecked, onCheckedChange = onCheckedChange,
                colors = SwitchDefaults.colors(
                    uncheckedTrackColor = SAndroidUITheme.colors.sAndroidUIBackgroundColors.cardBackgroundColor,
                    uncheckedThumbColor = SAndroidUITheme.colors.sAndroidUIOtherColors.switchDisableThumbColor,
                    uncheckedBorderColor = SAndroidUITheme.colors.sAndroidUIOtherColors.dividerColor,
                    uncheckedIconColor = SAndroidUITheme.colors.sAndroidUIIconColors.iconColor,
                    checkedThumbColor = Color.White,
                    checkedIconColor = SAndroidUITheme.colors.sAndroidUIOtherColors.accentColor,
                    checkedBorderColor = SAndroidUITheme.colors.sAndroidUIOtherColors.accentColor,
                    checkedTrackColor = SAndroidUITheme.colors.sAndroidUIOtherColors.accentColor))
        }
    }
}

fun Modifier.rippleClickable(
        enabled : Boolean = true, shouldClearFocus : Boolean = true, onClick : () -> Unit) =
    composed {
        val rippleTheme = LocalRippleTheme.current
        val focusManager = LocalFocusManager.current
        this.clickable(enabled = enabled,
            indication = rememberRipple(color = rippleTheme.defaultColor()),
            interactionSource = remember { MutableInteractionSource() }, onClick = {
                if(shouldClearFocus) {
                    focusManager.clearFocus()
                }
                onClick()
            })
    }

@Composable
fun Header(headerText : String) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 8.dp), text = headerText,
        color = SAndroidUITheme.colors.sAndroidUITextColors.primaryTextColor,
        style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold))
}