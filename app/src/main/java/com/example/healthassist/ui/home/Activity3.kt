
package com.example.healthassist.ui.home

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.healthassist.R

class Activity3 : AppCompatActivity() {
    lateinit var Bcontent:TextView
    lateinit var Lcontent:TextView
    lateinit var Scontent:TextView
    lateinit var Dcontent:TextView
    lateinit var diName:TextView
    lateinit  var dNum:TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        Bcontent=findViewById(R.id.Break2)
        Lcontent=findViewById(R.id.lunch2)
        Scontent=findViewById(R.id.snack2)
        Dcontent=findViewById(R.id.dinner2)
        diName= findViewById(R.id.Dname)
        dNum = findViewById(R.id.Daynum)
        if(MealPlanActivity.D_name.equals("Normal Person")) {
            if(ExampleTwo.D_num.equals("1")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="-> One grapefruit\n" +
                        "-> Two poached eggs (or fried in a non-stick pan)\n" +
                        "-> Two slices whole-grain toast with one pat butter each\n" +
                        "-> One cup low-fat milk\n" +
                        "-> One cup of black coffee or herbal tea\n" +
                        "(Macronutrients: approximately 555 calories with 27 grams protein, 63 grams carbohydrates, and 23 grams fat)\n" +
                        "\n"
                Lcontent.text="-> Chicken breast (6-ounce portion), baked or roasted (not breaded or fried)\n" +
                        "-> Large garden salad with tomato and onion with one cup croutons, topped with one tablespoon oil and vinegar (or salad dressing)\n" +
                        "->Glass of water \n" +
                        "(Macronutrients: 425 calories, 44 grams protein, 37 grams carbohydrates, 9 grams fat)"
                Scontent.text="-> One cup carrot slices\n" +
                        "-> Three tablespoon hummus\n" +
                        "-> One-half piece of pita bread\n" +
                        "-> Glass of water or herbal tea\n" +
                        "(Macronutrients: 157 calories, 6 grams protein, 25 grams carbohydrates, 5 grams fat)"
                Dcontent.text="-> One cup steamed broccoli\n" +
                        "-> One cup of brown rice\n" +
                        "-> Halibut (four-ounce portion)\n" +
                        "-> Small garden salad with one cup spinach leaves, tomato, and onion topped with two tablespoons oil and vinegar or salad dressing\n" +
                        "-> One glass white wine (regular or dealcoholized)\n" +
                        "-> Sparkling water with lemon or lime slice\n" +
                        "(646 calories, 42 grams protein, 77 grams carbohydrates, 8 grams fat)"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if (ExampleTwo.D_num.equals("2")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="-> One whole-wheat English muffin with two tablespoons peanut butter\n" +
                        "-> One orange\n" +
                        "-> Large glass (12 ounces) non-fat milk\n" +
                        "-> One cup of black coffee or herbal tea\n" +
                        "(Macronutrients: approximately 521 calories with 27 grams protein, 69 grams carbohydrates, and 18 grams fat)"
                Lcontent.text="-> One whole-wheat English muffin with two tablespoons peanut butter\n" +
                        "-> One orange\n" +
                        "-> Large glass (12 ounces) non-fat milk\n" +
                        "-> One cup of black coffee or herbal tea\n" +
                        "(Macronutrients: approximately 521 calories with 27 grams protein, 69 grams carbohydrates, and 18 grams fat) "
                Scontent.text="-> One cup (about 30) grapes\n" +
                        "-> Glass of water or herbal tea\n" +
                        "(Macronutrients: 60 calories, 0.6 grams protein, 12 grams carbohydrates, 0 grams fat) "
                Dcontent.text="-> Five-ounce sirloin steak\n" +
                        "-> One cup mashed potatoes\n" +
                        "-> One cup cooked spinach\n" +
                        "-> One cup green beans\n" +
                        "-> One glass beer (regular, lite or non-alcohol)\n" +
                        "-> Sparkling water with lemon or lime slice\n" +
                        "(671 calories, 44 grams protein, 63 grams carbohydrates, 18 grams fat) "+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if (ExampleTwo.D_num.equals("3")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="-> One medium bran muffin\n" +
                        "-> One serving turkey breakfast sausage\n" +
                        "-> One orange\n" +
                        "-> One cup non-fat milk\n" +
                        "-> One cup black coffee or herbal tea\n" +
                        "(Macronutrients: approximately 543 calories with 26 grams protein, 84 grams carbohydrates, and 15 grams fat)"
                Lcontent.text="-> Low sodium chicken noodle soup with six saltine crackers\n" +
                        "-> One medium apple\n" +
                        "-> Water\n" +
                        "(Macronutrients: 329 calories, 8 grams protein, 38 grams carbohydrates, 17 grams fat)"
                Scontent.text="-> One apple\n" +
                        "-> One slice Swiss cheese\n" +
                        "-> Sparkling water with lemon or lime slice\n" +
                        "(Macronutrients: 151 calories, 5 grams protein, 21 grams carbohydrates, 6 grams fat)"
                Dcontent.text="-> 8-ounce serving of turkey breast meat\n" +
                        "-> One cup baked beans\n" +
                        "-> One cup cooked carrots\n" +
                        "-> One cup cooked kale\n" +
                        "-> One glass of wine\n" +
                        "(784 calories, 84 grams protein, 76 grams carbohydrates, 3 grams fat)"+"Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if (ExampleTwo.D_num.equals("4")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="One cup whole wheat flakes with one cup non-fat milk and one teaspoon sugar\n" +
                        "One banana\n" +
                        "One slice whole-grain toast with one tablespoon peanut butter\n" +
                        "One cup of black coffee or herbal tea\n" +
                        "(Macronutrients: approximately 557 calories with 18 grams protein, 102 grams carbohydrates, and 12 grams fat) "
                Lcontent.text="Tuna wrap with one wheat flour tortilla, one-half can water-packed tuna (drained), one tablespoon mayonnaise, lettuce, and sliced tomato\n" +
                        "One sliced avocado\n" +
                        "One cup non-fat milk\n" +
                        "(Macronutrients: 419 calories, 27 grams protein, 37 grams carbohydrates, 19 grams fat)"
                Scontent.text="One cup cottage cheese (1-percent fat)\n" +
                        "One fresh pineapple slice\n" +
                        "Four graham crackers\n" +
                        "Sparkling water with lemon or lime slice\n" +
                        "(Macronutrients: 323 calories, 29 grams protein, 38 grams carbohydrates, 5 grams fat)"
                Dcontent.text="One cup cottage cheese (1-percent fat)\n" +
                        "One fresh pineapple slice\n" +
                        "Four graham crackers\n" +
                        "Sparkling water with lemon or lime slice\n" +
                        "(Macronutrients: 323 calories, 29 grams protein, 38 grams carbohydrates, 5 grams fat)"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if (ExampleTwo.D_num.equals("5")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="One piece French toast with one tablespoon maple syrup\n" +
                        "One scrambled or poached egg\n" +
                        "One serving turkey bacon\n" +
                        "One cup orange juice\n" +
                        "One cup black coffee or herbal tea\n" +
                        "(Macronutrients: approximately 449 calories with 16 grams protein, 57 grams carbohydrates, and 18 grams fat) "
                Lcontent.text="Veggie burger on a whole grain bun\n" +
                        "One cup northern (or other dry) beans\n" +
                        "One cup non-fat milk\n" +
                        "(Macronutrients: 542 calories, 38 grams protein, 85 grams carbohydrates, 8 grams fat)"
                Scontent.text="One apple\n" +
                        "One pita with two tablespoons hummus\n" +
                        "Sparkling water with lemon or lime slice\n" +
                        "(Macronutrients: 202 calories, 5 grams protein, 41 grams carbohydrates, 4 grams fat)"
                Dcontent.text="One trout filet\n" +
                        "One cup green beans\n" +
                        "One cup brown rice\n" +
                        "One small garden salad with two tablespoons salad dressing\n" +
                        "One glass of beer(optional)\n" +
                        "Sparkling water with lemon or lime slice\n" +
                        "(634 calories, 27 grams protein, 78 grams carbohydrates, 13 grams fat)"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if (ExampleTwo.D_num.equals("6")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="One cup corn flakes with two teaspoons sugar and one cup non-fat milk\n" +
                        "One banana\n" +
                        "One hard-boiled egg\n" +
                        "One cup black coffee or herbal tea\n" +
                        "(Macronutrients: approximately 401 calories with 18 grams protein, 72 grams carbohydrates, and 6 grams fat)"
                Lcontent.text="One cup whole wheat pasta with one-half cup red pasta sauce\n" +
                        "Medium garden salad with tomatoes and onions and two tablespoons salad dressing\n" +
                        "Glass of water \n" +
                        "(Macronutrients: 413 calories, 11 grams protein, 67 grams carbohydrates, 12 grams fat)"
                Scontent.text="One and one-half cup cottage cheese\n" +
                        "One fresh peach\n" +
                        "Glass of water\n" +
                        "(Macronutrients: 303 calories, 43 grams protein, 23 grams carbohydrates, 4 grams fat)"
                Dcontent.text="Four and one-half ounce serving of pork loin\n" +
                        "Small garden salad with tomatoes and onions topped with two tablespoons oil and vinegar (or salad dressing)\n" +
                        "One small baked sweet potato\n" +
                        "One cup asparagus\n" +
                        "One glass wine (regular or dealcoholized)\n" +
                        "Sparkling water with lemon or lime slice\n" +
                        "(500 calories, 46 grams protein, 35 grams carbohydrates, 10 grams fat)"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else {
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="One cup cooked oatmeal with one-half cup blueberries, one-half cup non-fat milk, and one tablespoon almond slivers\n" +
                        "Two slices turkey bacon\n" +
                        "One cup non-fat milk to drink\n" +
                        "One cup black coffee or herbal tea\n" +
                        "(Macronutrients: approximately 442 calories with 26 grams protein, 59 grams carbohydrates, and 14 grams fat) "
                Lcontent.text="Six-ounce baked chicken breast\n" +
                        "Large garden salad with tomatoes and onions and two tablespoons salad dressing\n" +
                        "One baked sweet potato\n" +
                        "One whole-wheat dinner roll.\n" +
                        "Glass of water \n" +
                        "(Macronutrients: 498 calories, 47 grams protein, 63 grams carbohydrates, 6 grams fat)"
                Scontent.text="One cup raw broccoli florets\n" +
                        "One cup raw sliced carrot\n" +
                        "Two tablespoons veggie dip or salad dressing\n" +
                        "One fresh peach\n" +
                        "Glass of water\n" +
                        "(Macronutrients: 112 calories, 3 grams protein, 25 grams carbohydrates, 1 gram fat)"
                Dcontent.text="3-ounce serving of baked or grilled salmon\n" +
                        "One-half cup black beans\n" +
                        "One cup Swiss chard\n" +
                        "One cup brown rice\n" +
                        "One whole wheat dinner roll with a pat of butter\n" +
                        "Sparkling water with lemon or lime slice\n" +
                        "(671 calories, 38 grams protein, 91 grams carbohydrates, 19 grams fat)"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }

        }
        if(MealPlanActivity.D_name.equals("Diabetes")) {
            if(ExampleTwo.D_num.equals("1")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="One poached egg and half a small avocado spread on one slice of Ezekiel bread, one orange. Total carbs: Approximately 39 "
                Lcontent.text="Mexican bowl: two-thirds of a cup low-sodium canned pinto beans, 1 cup chopped spinach, a quarter cup chopped tomatoes, a quarter cup bell peppers, 1 ounce (oz) cheese, 1 tablespoon (tbsp) salsa as sauce. Total carbs: Approximately 30."
                Scontent.text="20 1-gram baby carrots with 2 tbsp hummus. Total carbs: Approximately 21."
                Dcontent.text="1 cup cooked lentil penne pasta, 1.5 cups veggie tomato sauce (cook garlic, mushrooms, greens, zucchini, and eggplant into it), 2 oz ground lean turkey. Total carbs: Approximately 35."+
                        "Total carbs for the day: 125."+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if (ExampleTwo.D_num.equals("2")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="1 cup (100g) cooked oatmeal, three-quarters of a cup blueberries, 1 oz almonds, 1 teaspoon (tsp) chia seeds. Total carbs: Approximately 34 "
                Lcontent.text="Salad: 2 cups fresh spinach, 2 oz grilled chicken breast, half a cup chickpeas, half a small avocado, a half cup sliced strawberries, one quarter cup shredded carrots, 2 tbsp dressing. Total carbs: Approximately 52."
                Scontent.text="One small peach diced into one-third cup 2% cottage cheese. Total carbs: Approximately 16."
                Dcontent.text="Mediterranean couscous: two-thirds cup whole wheat cooked couscous, half a cup sautéed eggplant, four sundried tomatoes, five jumbo olives chopped, half a diced cucumber, 1 tbsp balsamic vinegar, fresh basil. Total carbs: Approximately 38."+
                        "Total carbs for the day: Approximately 140."+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if (ExampleTwo.D_num.equals("3")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Two-egg veggie omelet (spinach, mushrooms, bell pepper, avocado) with a half cup black beans, three-quarters cup blueberries. Total carbs: Approximately 34. "
                Lcontent.text="Sandwich: two regular slices high-fiber whole grain bread, 1 tbsp plain, no-fat Greek yogurt and 1 tbsp mustard, 2 oz canned tuna in water mixed with a quarter cup of shredded carrots, 1 tbsp dill relish, 1 cup sliced tomato, half a medium apple. Total carbs: Approximately 40."
                Scontent.text="1 cup unsweetened kefir. Total carbs: Approximately 12."
                Dcontent.text="Half a cup (50g) succotash, 1 tsp butter, 2 oz pork tenderloin, 1 cup cooked asparagus, half a cup fresh pineapple. Total carbs: Approximately 34."+
                        "Total carbs for the day: Approximately 120."+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if (ExampleTwo.D_num.equals("4")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Sweet potato toast: two slices (100 g) toasted sweet potato, topped with 1 oz goat cheese, spinach, and 1 tsp sprinkled flaxseed. Total carbs: Approximately 44. "
                Lcontent.text="2 oz roast chicken, 1 cup raw cauliflower, 1 tbsp low-fat French dressing, 1 cup fresh strawberries. Total carbs: Approximately 23."
                Scontent.text=" cup low-fat plain Greek yogurt mixed with half a small banana. Total carbs: Approximately 15."
                Dcontent.text="A two-thirds cup of quinoa, 8 oz silken tofu, 1 cup cooked bok choy, 1 cup steamed broccoli, 2 tsp olive oil, one kiwi. Total carbs: Approximately 44."+
                        "Total carbs for the day: Approximately 126.\n" +
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if (ExampleTwo.D_num.equals("5")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="A one-third cup of Grape-Nuts (or similar high-fiber cereal), half a cup blueberries, 1 cup unsweetened almond milk. Total carbs: Approximately 41. "
                Lcontent.text="Salad: 2 cups spinach, a quarter cup tomatoes, 1 oz cheddar cheese, one boiled chopped egg, 2 tbsp yogurt dressing, a quarter cup grapes, 1 tsp pumpkin seeds, 2 oz roasted chickpeas. Total carbs: Approximately 47."
                Scontent.text=" 1 cup celery with 1 tbsp peanut butter. Total carbs: Approximately 6."
                Dcontent.text="2 oz salmon filet, one medium baked potato, 1 tsp butter, 1.5 cups steamed asparagus. Total carbs: Approximately 39."+
                        "Total carbs for the day: Approximately 133."+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if (ExampleTwo.D_num.equals("6")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="1 cup low-fat plain Greek yogurt sweetened with half a banana mashed, 1 cup strawberries, 1 tbsp chia seeds. Total carbs: Approximately 32. "
                Lcontent.text="Tacos: two corn tortillas, a one-third cup cooked black beans, 1 oz low-fat cheese, 2 tbsp avocado, 1 cup coleslaw, salsa as dressing. Total carbs: Approximately 70."
                Scontent.text="One cherry tomato and 10 baby carrots with 2 tbsp hummus. Total carbs: Approximately 14."
                Dcontent.text="alf medium baked potato with skin, 2 oz broiled beef, 1 tsp butter, 1.5 cups steamed broccoli with 1 tsp nutritional yeast sprinkled on top, three-quarters cup whole strawberries. Total carbs: Approximately 41."+
                        "Total carbs for the day: Approximately 157."+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else {
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Chocolate peanut oatmeal: 1 cup cooked oatmeal, 1 scoop chocolate vegan or whey protein powder, 1.5 tbsp peanut butter, 1 tbsp chia seeds. Total carbs: Approximately 21. "
                Lcontent.text="One small whole wheat pita pocket, half a cup cucumbers, half a cup tomatoes, half a cup cooked lentils, half a cup leafy greens, 3 tbsp salad dressing. Total carbs: Approximately 30."
                Scontent.text="1 oz pumpkin seeds, one medium apple. Total carbs: Approximately 26."
                Dcontent.text="3 oz boiled shrimp, 1 cup green peas, 1 tsp butter, half a cup cooked beets, 1 cup sauteed Swiss chard, 1 tsp balsamic vinegar. Total carbs: Approximately 39."+
                        "Total carbs for the day: Approximately 116."+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }

        }
        else if(MealPlanActivity.D_name.equals("Blood Pressure")){
            if(ExampleTwo.D_num.equals("1")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="(266 calories)\n" +
                        "Salsa & Egg Toast\n" +
                        "• 1 slice whole-wheat bread, toasted\n" +
                        "• 1 large egg, cooked in 1/4 tsp. olive oil or coat pan with a thin layer of cooking spray (1-second spray). Season with a pinch each of kosher salt and pepper.\n" +
                        "• 2 Tbsp. salsa\n" +
                        "Top toast with egg and salsa.\n" +
                        "• 1 medium banana"
                Lcontent.text="(343 calories)\n" +
                        "White Beans & Veggie Salad\n" +
                        "• 2 cups mixed greens\n" +
                        "• 3/4 cup veggies of your choice (try cucumbers and tomatoes)\n" +
                        "• 1/3 cup white beans, rinsed\n" +
                        "• 1/2 avocado, diced\n" +
                        "Combine ingredients and top salad with 1 Tbsp. red-wine vinegar, 2 tsp. olive oil and freshly ground pepper."
                Scontent.text=" (62 calories)\n" +
                        "• 1 medium orange"
                Dcontent.text="(449 calories)\n" +
                        "1 servingGarlic Roasted Salmon & Brussels Sprouts\n" +
                        "1/2 cup cooked lentils seasoned with a pinch each of kosher salt and pepper"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("2")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="268 calories)\n" +
                        "Strawberry Oatmeal\n" +
                        "• 1/2 cup rolled oats, cooked in 1 cup skim milk\n" +
                        "• 1/2 cup sliced strawberries\n" +
                        "Cook oats and top with strawberries and a pinch of cinnamon."
                Lcontent.text=" (318 calories)\n" +
                        "Veggie-Hummus Sandwich\n" +
                        "• 2 slices whole-wheat bread\n" +
                        "• 3 Tbsp. hummus\n" +
                        "• 1/4 avocado, mashed\n" +
                        "• 1/4 medium red bell pepper, sliced\n" +
                        "• 1/4 cup cucumber slices\n" +
                        "• 1 cup mixed greens\n" +
                        "Spread each slice of bread with hummus and avocado. Top one slice with vegetables and press the slices together to make a sandwich."
                Scontent.text="(50 calories)\n" +
                        "• 2 medium carrots"
                Dcontent.text="Dinner(472 calories)\n" +
                        "1 servingSpaghetti Squash with Roasted Tomatoes, Beans & Almond Pesto\n" +
                        "1 diagonal slice baguette (1/4 inch thick), preferably whole-wheat, topped with 2 Tbsp. grated Parmesan cheese and toasted"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("3")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="(270 calories)\n" +
                        "Blueberry & Almond Yogurt Parfait\n" +
                        "• 3/4 cup nonfat plain Greek yogurt\n" +
                        "• 1/4 cup blueberries\n" +
                        "• 1 1/2 Tbsp. slivered almonds\n" +
                        "Top yogurt with blueberries and almonds.\n" +
                        "• 1 2/3 cups cubed cantaloupe"
                Lcontent.text="347 calories)\n" +
                        "Mixed Greens with Lentils & Sliced Apple\n" +
                        "• 1 1/2 cups mixed greens\n" +
                        "• 1/2 cup cooked lentils\n" +
                        "• 1 apple, sliced\n" +
                        "• 1 1/2 Tbsp. crumbled feta cheese\n" +
                        "Top greens with lentils, 1/2 of the apple slices and feta. Dress the salad with 1 Tbsp. red-wine vinegar and 2 tsp. olive oil. Serve the remaining apple slices on the side."
                Scontent.text="(62 calories)\n" +
                        "• 1 medium orange"
                Dcontent.text="(448 calories)\n" +
                        "1 1/3 cupsRoasted Beet Salad\n" +
                        "4 oz. chicken breast, cooked in 1 tsp. olive oil and seasoned with 1/4 tsp. cumin and a pinch each of kosher salt and pepper"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("4")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="(270 calories)\n" +
                        "White Bean & Avocado Toast\n" +
                        "• 1 slice whole-wheat bread, toasted\n" +
                        "• 1/2 avocado, mashed\n" +
                        "• 1/4 cup canned white beans, rinsed and mashed\n" +
                        "Top toast with mashed avocado and white beans. Season with a pinch each of kosher salt, pepper and crushed red pepper."
                Lcontent.text=" (341 calories)\n" +
                        "Green Salad with Chicken\n" +
                        "• 2 cups mixed greens\n" +
                        "• 3 oz. leftover cooked chicken breast\n" +
                        "• 2/3 cup Roasted Beet Salad\n" +
                        "Combine ingredients and top with 2 tsp. each lemon juice and olive oil."
                Scontent.text="(62 calories)\n" +
                        "• 1 medium orange"
                Dcontent.text=" (472 calories)\n" +
                        "Black Bean & Corn Tacos\n" +
                        "• 2 corn tortillas, warmed\n" +
                        "• 1/4 cup canned black beans, rinsed and mashed\n" +
                        "• 1/2 cup corn\n" +
                        "• 1/2 avocado, diced\n" +
                        "• 1/4 cup salsa"+
                        "Spread tortillas with beans. Top with corn, avocado and salsa.\n" +
                        "• 2 cups mixed greens, topped with 1 Tbsp. lime juice, 2 tsp. olive oil and a pinch each of kosher salt and pepper."+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("5")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="(288 calories)\n" +
                        "Blueberry & Almond Yogurt Parfait\n" +
                        "• 3/4 cup nonfat plain Greek yogurt\n" +
                        "• 1/4 cup blueberries\n" +
                        "• 1 1/2 Tbsp. slivered almonds\n" +
                        "Top yogurt with blueberries and almonds.\n" +
                        "• 2 cups cubed cantaloupe"
                Lcontent.text="(288 calories)\n" +
                        "Blueberry & Almond Yogurt Parfait\n" +
                        "• 3/4 cup nonfat plain Greek yogurt\n" +
                        "• 1/4 cup blueberries\n" +
                        "• 1 1/2 Tbsp. slivered almonds\n" +
                        "Top yogurt with blueberries and almonds.\n" +
                        "• 2 cups cubed cantaloupe"
                Scontent.text="(42 calories)\n" +
                        "• 1/2 cup blueberries"
                Dcontent.text="(428 calories)\n" +
                        "2 1/2 cupsAvocado & Shrimp Chopped Salad\n" +
                        "1 diagonal slice baguette (1/4 inch thick), preferably whole-wheat, toasted"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("6")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text=" (266 calories)\n" +
                        "Banana Oatmeal\n" +
                        "• 1/3 cup rolled oats, cooked in 2/3 cup milk\n" +
                        "• 1 medium banana, sliced\n" +
                        "Cook oats and top with banana and a pinch of cinnamon."
                Lcontent.text=" (308 calories)\n" +
                        "Tuna & White Bean Salad\n" +
                        "• 1/2 cup canned white beans, rinsed\n" +
                        "• 2 1/2 oz. (about 1/4 cup) chunk light tuna in water, drained\n" +
                        "• 8 cherry tomatoes, halved\n" +
                        "• 1/2 cucumber, sliced\n" +
                        "• 1 Tbsp. red-wine vinegar\n" +
                        "• 2 tsp. olive oil\n" +
                        "• 2 cups mixed greens\n" +
                        "Combine beans, tuna, tomatoes and cucumber. Toss with vinegar, oil and a pinch each of kosher salt and pepper. Serve over greens."
                Scontent.text=" (62 calories)\n" +
                        "• 1 medium orange"
                Dcontent.text="440 calories)\n" +
                        "1 1/2 cupsChicken Chili with Sweet Potatoes\n" +
                        "2 cups mixed greens, topped with 1 Tbsp. balsamic vinegar, 2 tsp. olive oil and a pinch each of kosher salt and pepper."+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else {
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="(255 calories)\n" +
                        "Egg & Tomato Tortilla\n" +
                        "• 1 corn tortilla\n" +
                        "• 1 large egg, cooked in 1/4 tsp. olive oil or coat pan with a thin layer of cooking spray (1-second spray). Season with a pinch of pepper.\n" +
                        "• 5 cherry tomatoes, halved\n" +
                        "Top tortilla with egg and tomatoes.\n" +
                        "• 1 medium banana"
                Lcontent.text="1 1/2 cups Chicken Chili with Sweet Potatoes"
                Scontent.text="1 cup strawberries"
                Dcontent.text=" 1 serving Stuffed Delicata Squash\n" +
                        "• 2 cups mixed greens\n" +
                        "• 1/4 cup grated carrot\n" +
                        "Top greens with carrot and drizzle with 1 Tbsp. balsamic vinegar and 2 tsp. olive oil."+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
        }
        else if(MealPlanActivity.D_name.equals("Heart Problem")){
            if(ExampleTwo.D_num.equals("1")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Oatmeal and fruit: 1 serving of oatmeal (½ cup dry oatmeal) prepared with water, 3 tablespoons of raisins, or 1 banana, or 1½ cups of berries or melon—mixed with 1 tablespoon of ground flaxseeds—plus 1 slice of whole-wheat bread, toasted and topped with a spread of plant sterol or stanol margarine (e.g., Benecol or Take Control)."
                Lcontent.text="Soup and pita bread: A bowl of noncreamy, vegetable-based soup (approximately 2 cups)—try tomato, minestrone, lentil, chicken noodle, vegetarian chili, tomato rice, etc.—you'll need to avoid the versions that use cream, whole milk, or cheese in the ingredients. With that, 1 regular-size whole-wheat pita bread and a vegetable salad with 1 tablespoon of vinaigrette dressing (or 1 teaspoon olive oil and unlimited vinegar)."
                Scontent.text="1 piece of fruit, with 1 slice of low-fat cheese, or tofu cheese"
                Dcontent.text="4 ounces salmon\n" +
                        "1/2 cup green beans with 1 tablespoon toasted almonds\n" +
                        "2 cups mixed salad greens\n" +
                        "2 tablespoons low-fat salad dressing\n" +
                        "1 tablespoon sunflower seeds\n" +
                        "1 cup skim milk\n" +
                        "1 small orange"+"Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("2")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Cereal/milk/fruit: 1 cup high-fiber cereal (any brand that provides 5+ grams fiber and 120 calories or less per serving)—1 cup skim, 1% low-fat milk or soymilk—plus 1 serving of any type of fruit (½ banana, 1 cup berries, or 2 tablespoons of raisins)—plus 1 slice of whole-wheat toast, topped with a spread of plant sterol or stanol margarine (e.g., Benecol or Take Control)."
                Lcontent.text="Sandwich and salad: 3–5 ounces of lean turkey breast, grilled chicken, lean ham, or low-fat tuna salad—on 2 slices of whole-wheat or rye bread, with 1 slice low-fat cheese, lettuce, tomato, and mustard, catsup, barbecue sauce, or low-fat mayonnaise. With that, one side salad with 1 tablespoon of vinaigrette dressing (or 1 teaspoon of olive oil and unlimited vinegar)."
                Scontent.text="1 sliced apple with 1 teaspoon of natural peanut butter\n" +
                        "Small bag of oat bran pretzels"
                Dcontent.text="Chicken stir-fry (3 ounces) with eggplant (1 cup) and basil\n" +
                        "1 cup brown rice with 1 tablespoon chopped dried apricots\n" +
                        "1 cup steamed broccoli\n" +
                        "4 ounces red wine or concord grape juice"+"Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("3")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Tomato/cheese toast with fruit: 2 slices of whole-wheat bread, toasted and topped with tomato slices and 2 slices of melted low-fat or nonfat cheese—plus 1 serving of any type of fruit."
                Lcontent.text="Grilled fish and vegetables: 3–4 ounces of grilled or barbecued chicken breast (no skin)—or any type of grilled fish with a side of steamed or lightly grilled vegetables (2 cups)—plus a medium sweet potato. Day 4 Japanese food: A salad with ginger dressing (go easy), an order of edamame (soybeans), plus 4 pieces of sushi and 5 pieces of sashimi. Use low-sodium soy sauce and unlimited fresh ginger."
                Scontent.text="1 ounce of walnuts or almonds\n" +
                        "Nonfat flavored yogurt (8-ounce container)"
                Dcontent.text=" Salads (use olive oil and vinegar, or vinaigrette)"+
                        " 5 ounces of grilled/broiled/baked chicken breast"+
                        " Anything goes! Steamed or lightly grilled with olive oil or vegetable oil, or with plant sterol margarine spread."+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("4")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Egg white omelet: 5 egg whites, or a small container of egg substitute, with any kind of vegetable thrown in (for example: onion, tomato, and pepper)—use nonstick cooking spray to fry eggs—plus 2 slices of whole-wheat toast with a spread of plant sterol or stanol margarine. Also, you have the option of 1 fruit serving."
                Lcontent.text="Japanese food:A salad with ginger dressing (go easy), an order of edamame (soybeans), plus 4 pieces of sushi and 5 pieces of sashimi. Use low-sodium soy sauce and unlimited fresh ginger."
                Scontent.text="1 cup baby carrots with 2 tablespoons hummus"
                Dcontent.text=" shrimp cocktail with red sauce, or mussels marinara"+
                        "fish, seafood, tofu, turkey breast(any one)"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("5")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Yogurt and fruit: One container (8-ounce) of nonfat, flavored yogurt (or 1 cup 1% cottage cheese)—mixed with 1 serving of any type of fruit—plus 2 tablespoons ground flaxseeds and 2 tablespoons wheat germ—plus 1 slice of whole-wheat toast, with a spread of plant sterol/stanol margarine."
                Lcontent.text="Chinese food: An order of steamed chicken or tofu with mixed vegetables. Ask for the garlic sauce on the side and use 1–2 tablespoons on your dish, then sprinkle additional low-sodium soy sauce— plus ½ cup of brown rice."
                Scontent.text="Fresh fruit\n" +
                        "1 ounce nuts"
                Dcontent.text="½–1 cup of whole-grain starch; brown rice, couscous, or whole-wheat pasta with olive oil or marinara sauce, or small sweet potato."+
                        "Anything goes! Steamed or lightly grilled with olive oil or vegetable oil, or with plant sterol margarine spread."+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("6")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Toast/tomato/salmon with fruit: 2 slices of whole-wheat toast topped with a thin spread of light cream cheese, sliced tomato, and salmon. Also, 1 serving of fruit."
                Lcontent.text="Large salad entree: Unlimited raw vegetables—topped with 3–5 ounces plain tuna, grilled salmon, grilled shrimp, chicken breast, turkey breast, or tofu—plus 1/2 cup of chickpeas, beans, or corn—plus 1 tablespoon of chopped walnuts—and 2–3 teaspoons of olive oil and unlimited vinegar. Also, 1 whole-wheat pita"
                Scontent.text="1 cup edamame (soybeans in the pod)\n" +
                        "Baby carrots and salsa"
                Dcontent.text="steamed artichokes, or sliced tomatoes, or vegetables (mushrooms, asparagus, etc.)."+
                        "Roti(2-3)"
                "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else {
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Soy/Fruit smoothie: 1 cup soymilk mixed with 1 cup frozen strawberries, 1/2 banana, and ice cubes; place in a blender and mix. With 1 slice of whole-wheat toast topped with 2 teaspoons of natural peanut butter.\n"
                Lcontent.text="Potato and chili: Plain baked potato with 2 cups of vegetarian chili and low-fat sour cream."
                Scontent.text="1 cup baby carrots with 2 tablespoons hummus\n" +
                        "Large pear"+
                        "Roti(2-3)"
                Dcontent.text=""+"Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
        }
        else if(MealPlanActivity.D_name.equals("Acidity")){
            if(ExampleTwo.D_num.equals("1")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="chia and strawberry quinoa"
                Lcontent.text=" sweet and savory salad"
                Scontent.text=" 1/2 cup toasted nuts and dried fruits"
                Dcontent.text="simple green salad with olive oil and apple cider vinegar, 3-4 oz. roasted chicken with roasted sweet potatoes and parsnips."+"Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("2")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="vegan apple parfait"
                Lcontent.text="savory avocado wraps and white bean stew"
                Scontent.text=" 1 handful of toasted pumpkin seeds"
                Dcontent.text="simple cucumber salad with olive oil and apple cider vinegar. 3-4 oz. roasted chicken with roasted Brussels sprouts with red peppers"+"Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("3")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="berry purple smoothie"
                Lcontent.text="Asian sesame dressing and noodles"
                Scontent.text="a handful of dried apricot"
                Dcontent.text="4 oz. oven-roasted salmon, ½ baked sweet potato, curried beets and greens"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("4")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text=" apple and almond butter oats"
                Lcontent.text="green goddess bowl"
                Scontent.text="a handful of almonds"
                Dcontent.text="kale pesto zucchini noodles or Roti(2-3)"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("5")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="power smoothie"
                Lcontent.text="quinoa burrito bowl or Rice"
                Scontent.text=" a handful dates"
                Dcontent.text="wild rice mushroom and almond risotto"+"Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("6")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text=" chia breakfast pudding"
                Lcontent.text=" ½ cup blueberries"+
                        "miso soup with fermented tofu"
                Scontent.text="a handful of macadamia nuts"
                Dcontent.text="roasted root vegetables with 4 oz salmon\n"+"Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else {
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="quinoa porridge"
                Lcontent.text="Mexican quinoa salad"
                Scontent.text=": a handful of dried coconut slices"
                Dcontent.text="pumpkin soup."+"Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
        }
        else if(MealPlanActivity.D_name.equals("Weight Loss")){
            if(ExampleTwo.D_num.equals("1")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text=" Sambar with 2 brown rice idlis/ Paneer sandwich with mint chutney"
                Lcontent.text="Whole-grain roti with mixed-vegetable curry with one dal"
                Scontent.text="a handful of dried coconut slices"
                Dcontent.text=" Tofu/chicken curry with mixed vegetables and a fresh spinach salad/chicken gravy with 2 multigrain rotis"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("2")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Chana dal pancakes with mixed vegetables and a glass of milk/ bread and egg with fruits"
                Lcontent.text="Chickpea curry with brown rice/ Brown rice with dal"
                Scontent.text="Hummus and vegetables. Hummus is a traditional Mediterranean dish that people make from pureed chickpeas. ..."
                Dcontent.text="Khichdi with sprout salad/Veg paratha with raita"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("3")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Apple cinnamon porridge/ Vegetable uttapam with sambhar"
                Lcontent.text="Whole-grain roti with tofu/ non veg and mixed vegetables"
                Scontent.text="Celery sticks and nut butter. Celery is a low-calorie vegetable. ..."
                Dcontent.text="Palak paneer with brown rice and vegetables/ 2 Multigrain rotis with chicken and curd"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("4")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Yogurt with sliced fruits and sunflower seeds/ vegetable poha"
                Lcontent.text=" Whole-grain roti with vegetable sabzi/ Dal with veg or non veg sabzi and brown rice"
                Scontent.text="Greek yogurt with berries. ..."
                Dcontent.text="Chana masala with basmati rice and green salad/ One bowl of fruits and vegetables with multigrain rotis"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("5")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="egetable dalia and a glass of milk/ 3-4 dal paddu with sambar"
                Lcontent.text="Vegetable sambar with brown rice/ 2 multigrain roti with veg/non veg curry"
                Scontent.text="Low-fat cheese. ..."
                Dcontent.text=" Tofu curry with potatoes and mixed vegetables/ chicken curry with 2 multigrain rotis"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("6")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Multigrain parathas with avocado and sliced papaya/ dal paratha with mixed vegetables"
                Lcontent.text=" Large salad with rajma curry and quinoa/ one bowl mixed vegetable kadai"
                Scontent.text="Celery sticks and nut butter"
                Dcontent.text="Lentil pancakes with tofu tikka masala/ green salad with mixed vegetables and multigrain roti"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else {
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="Buckwheat porridge with sliced mango/ fruit salad with a glass of milk"
                Lcontent.text="Vegetable soup with whole-grain roti/ one bowl millet and dal khichdi with multigrain roti"
                Scontent.text="Air-popped popcorn"
                Dcontent.text="Masala-baked tofu with vegetable curry/ non veg curry (chicken, seafood) with multigrain roti"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
        }
        else if(MealPlanActivity.D_name.equals("Weight Gain")){
            if(ExampleTwo.D_num.equals("1")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="3 to 4 slices of whole wheat bread toast with peanut butter + 3 egg whites + 1 full egg omelette or\n" +
                        "1 cup of low fat milk + 1 scoop of whey protein+ 150 gms of oatmeal + 1 banana+ a few almonds+ walnuts."
                Lcontent.text="150 gms of brown rice or whole wheat chapattis + 150 gms of skinless chicken breast / fish + 1 bowl of mixed vegetables+ green chutney+ salad"
                Scontent.text="1 fruit + 1 cup of low fat yoghurt or 1 cup of low fat milk with 1 scoop of whey protein or whole wheat bread 3 egg whites/ steamed chicken sandwich."
                Dcontent.text="1 small fish or 100 gms of skinless/ lean chicken + stir fried veggies with baked potato + 1 cup of brown rice/ whole wheat chappati"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("2")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="1 bowl of sprouts and vegetable poha + 1 glass milk (add 1 tbsp walnuts + crushed almond powder + ½ tsp sugar) + half an apple Or 3 whole eggs (scrambled/poached/boiled) + few vegetables + half an apple"
                Lcontent.text="2 rotis (multigrain with added ghee) + 1 bowl of pulses or dal or chicken + 1 bowl of vegetables + 1 bowl of tofu or paneer salad"
                Scontent.text="1 cup of Greek yogurt with fruits and nuts Or 1 glass of a mixed fruit smoothie with one date Or Omelette with two eggs Or 1 chicken breast sandwich Or 2 multigrain toasts with 2 tbsp of nut butter"
                Dcontent.text="Brown rice pulao with rajma + 1 bowl of stir-fried vegetables + half a bowl of raita"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("3")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="1 cup (80 grams) of oats with 1 cup (240 ml) of dairy or plant-based milk, 1 sliced banana, and 2 tablespoons (33 grams) of peanut butter"
                Lcontent.text="1 cup (100 grams) of spaghetti with 3/4 cups (183 grams) of tomato sauce and 4 ounces (112 grams) of cooked ground beef, as well as 1 medium breadstick with 1 tablespoon (14 grams) of butter"
                Scontent.text="1 cup (226 grams) of cottage cheese and 1/2 cup (70 grams) of blueberries"
                Dcontent.text="4 ounces (110 grams) of salmon, 1 cup (100 grams) of brown rice, and 5 asparagus spears"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("4")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text=" smoothie made with 2 cups (480 ml) of dairy or plant-based milk, 1 cup (227 grams) of yogurt, 1 cup (140 grams) of blueberries, and 2 tablespoons (33 grams) of almond butter"
                Lcontent.text="12-inch sub sandwich with meat, cheese, and veggies with 3 ounces (85 grams) of baby carrots, 2 tablespoons (28 grams) of hummus, and apple slices on the side"
                Scontent.text="1 scoop of whey protein powder mixed in 1 cup (240 ml) of dairy or plant-based milk"
                Dcontent.text="4-ounce (113-gram) sirloin steak, 1 medium-sized (173-gram) baked potato with 1 tablespoon (14 grams) of butter, and 1 cup (85 grams) of broccoli"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("5")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="3 whole-wheat waffles with 2 tablespoons (33 grams) of peanut butter, 1 orange, and 2 cups (480 ml) of dairy or plant-based milk"
                Lcontent.text="6-ounce (170-gram) 90%-lean burger on a whole-wheat bun with 1 tomato slice and lettuce leaf, as well as 1 1/2 cup (86 grams) of homemade sweet potato fries cooked in olive oil"
                Scontent.text="1 cup (227 grams) of Greek yogurt and 1 cup (140 grams) of strawberries"
                Dcontent.text=" 4-ounce (112-gram) chicken breast, 1/2 cup (84 grams) of quinoa, and 1 1/3 cups (85 grams) of sugar snap peas"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else if(ExampleTwo.D_num.equals("6")){
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="3-egg omelet with sliced onions, red and green bell peppers, and 1/4 cup (28 grams) of shredded cheese with 2 cups (480 ml) of dairy or plant-based milk to drink"
                Lcontent.text="8 ounces (226 grams) of tilapia fillets, 1/4 cup (32 grams) of lentils, and a salad topped with 1/4 cup (30 grams) of walnuts"
                Scontent.text="2 sliced, hard-boiled eggs atop a mixed green salad\n"
                Dcontent.text=" turkey chili made with a 4-ounce (114-gram) turkey breast, chopped onions, garlic, celery, and sweet peppers, 1/2 cup (123 grams) of canned, diced tomatoes, and 1/2 cup (120 grams) of cannellini beans, topped with 1/4 cup (28 grams) of shredded cheese. Add oregano, bay leaves, chili powder, and cumin as desired for taste."+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
            else {
                diName.text=MealPlanActivity.D_name
                dNum.text=ExampleTwo.D_num
                Bcontent.text="3 whole eggs, 1 apple, and 1 cup (80 grams) of oatmeal made with 1 cup (240 ml) of dairy or plant-based milk"
                Lcontent.text="6-ounce (168-gram) chicken breast, 1 medium-sized (151-gram) sweet potato, 3/4 cup (85 grams) of green beans, and 1 ounce (28 grams) of nuts"
                Scontent.text="1/2 cup (130 grams) of chickpeas atop greens"
                Dcontent.text="burrito bowl with 6 ounces (170 grams) of chopped sirloin steak, 1/2 cup (130 grams) of black beans, 1/2 cup (90 grams) of brown rice, 1 cup (35 grams) of shredded lettuce and spinach, and 2 tablespoons (16 grams) of salsa"+
                        "Note: This meal plan is controlled for calories, fiber, saturated fat, sodium and potassium. If another nutrient is of particular concern, speak with your health-care provider about altering this meal plan to better suit your individual health needs."
            }
        }

    }
}