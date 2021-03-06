/*
 * Copyright (c) 2018. Jahir Fiquitiva
 *
 * Licensed under the CreativeCommons Attribution-ShareAlike
 * 4.0 International License. You may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *    http://creativecommons.org/licenses/by-sa/4.0/legalcode
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jahirfiquitiva.libs.blueprint.ui.widgets

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.recyclerview.widget.RecyclerView

@SuppressLint("ClickableViewAccessibility")
class NonClickableRecyclerView : RecyclerView {
    constructor(context: Context) : super(context) {
        isNestedScrollingEnabled = false
    }
    
    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        isNestedScrollingEnabled = false
    }
    
    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int)
        : super(context, attributeSet, defStyleAttr) {
        isNestedScrollingEnabled = false
    }
    
    override fun onTouchEvent(e: MotionEvent?): Boolean = false
    
    override fun performClick(): Boolean = false
}