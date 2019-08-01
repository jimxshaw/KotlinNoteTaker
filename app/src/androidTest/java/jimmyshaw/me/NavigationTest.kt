package jimmyshaw.me

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.contrib.DrawerActions
import androidx.test.espresso.contrib.NavigationViewActions
import androidx.test.espresso.contrib.RecyclerViewActions

@RunWith(AndroidJUnit4::class)
class NavigationTest {

    @Rule @JvmField
    val itemsActivity = ActivityTestRule(ItemsActivity::class.java)

    @Test
    fun selectNoteAfterNavigationDrawerChange() {

    }
}