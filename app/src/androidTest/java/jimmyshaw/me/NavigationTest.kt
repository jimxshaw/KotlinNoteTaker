package jimmyshaw.me

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.contrib.DrawerActions
import androidx.test.espresso.contrib.NavigationViewActions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.jwhh.notekeeper.CourseRecyclerAdapter

@RunWith(AndroidJUnit4::class)
class NavigationTest {

    @Rule @JvmField
    val itemsActivity = ActivityTestRule(ItemsActivity::class.java)

    @Test
    fun selectNoteAfterNavigationDrawerChange() {
        onView(withId(R.id.drawer_layout)).perform(DrawerActions.open())
        onView(withId(R.id.nav_view)).perform(NavigationViewActions.navigateTo(R.id.nav_courses))

        val coursePosition = 0
        onView(withId(R.id.listItems)).perform(
            RecyclerViewActions.actionOnItemAtPosition<CourseRecyclerAdapter.ViewHolder>(coursePosition, click())
        )
    }
}