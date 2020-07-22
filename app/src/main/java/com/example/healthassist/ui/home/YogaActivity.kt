package com.example.healthassist.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.healthassist.R

class YogaActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga)
        this.setTitle("YOGA")
        val imagesList = listOf<Image>(
            Image(
                R.drawable.surya_namaskar,
                R.drawable.yogaeight,
                "Surya Namaskar",
                "Yoga Benefits:Maintains your nervous system and boosts your immune system\n"+"Stand with feet wide, 3–4 feet apart. Shift your right heel out so your toes are pointing slightly inward. Turn your left foot out 90 degrees. Line up your left heel with the arch of your right foot.\n" +
                        "\n" +
                        "Bend your left knee to a 90-degree angle, keeping the knee in line with the second toe to protect the knee joint. Stretch through your straight back leg and ground down into the back foot.\n" +
                        "\n" +
                        "On an inhale, bring arms to a T at shoulder height. Draw your shoulder blades down the back. Spread your fingers and keep palms facedown. Gaze over the front fingers. As you exhale, sink deeper into the stretch."

            ),
            Image(
                R.drawable.pose_a,
                R.drawable.yogaone,
                "Yoga Pose Type 1:Virabhadrasana ",
                "Yoga Benefits:Maintains your nervous system and boosts your immune system\n"+"Stand with feet wide, 3–4 feet apart. Shift your right heel out so your toes are pointing slightly inward. Turn your left foot out 90 degrees. Line up your left heel with the arch of your right foot.\n" +
                        "\n" +
                        "Bend your left knee to a 90-degree angle, keeping the knee in line with the second toe to protect the knee joint. Stretch through your straight back leg and ground down into the back foot.\n" +
                        "\n" +
                        "On an inhale, bring arms to a T at shoulder height. Draw your shoulder blades down the back. Spread your fingers and keep palms facedown. Gaze over the front fingers. As you exhale, sink deeper into the stretch."

            ),
            Image(
                R.drawable.pose_b,
                R.drawable.yogatwo,
                "Yoga Pose Type 2:Paschimottanasana",
                "Yoga Benefits:Helps you focusand relaxes your system\n"+"Sit up with your back straight and toes pointing outwards.\n"+"Breathe in and raise your hands over your head and stretch. Now, while breathing out bring your hands down and bend then forward to touch your legs."
            ),
            Image(
                R.drawable.pose_c,
                R.drawable.yogathree,
                "Yoga Pose Type 3:Vrikshasana (Tree Pose)",
                "Yoga Benefits:Regulates your adrenal glands and lowers blood sugar.\n"+"Place your right foot high up on your left thigh. The sole of the foot should be flat and placed firmly. Keep your left leg straight and find your balance. While inhaling, raise your arms over your head and bring your palms together.\n"+" Ensure that your spine is straight and take a few deep breaths. Slowly exhale, bring your hands down and release your right leg.\n"+" Back in the standing position repeat the same with the other leg.\n"+
                        "Place your hands wherever they reach, hold your toes if you can but don't force yourself.\n"+"Breathe in and elongate your spine. While breathing out, keep your navel close to your knees.\n"

            ),
            Image(
                R.drawable.pose_d,
                R.drawable.yogafour,
                "Yoga Pose Type 4:Dhanurasana",
                "Yoga Benefits:ps your heart rate and drps your blood pressure\n"+"Lie facedown, roll your shoulder blades down the back, and send your arms back behind you. Bend your knees so that your feet are near your butt.\n" +
                        "\n" +
                        "On an inhale, lift your upper body and legs off the floor, keeping the hips grounded. Reach back to grab outer ankles. Use the leverage to lift your body up and broaden across the chest."
            ),
            Image(
                R.drawable.pose_e,
                R.drawable.yogafive,
                "Yoga Pose Type 5:Quad-Psoas Wall Stretch",
                "Yoga Benefits:Increases your blood flow,drains your lymph and boosts immunity\n"+"Start in a low lunge position with your right foot facing away from the wall and position your left knee where the floor meets the wall, so your left shin and top of left foot are flat against the wall. (You may want to place a folded blanket under your left knee for padding.) \n"+"Place hands on your right knee and push your hips forward away from the wall. Then draw your hips back toward the wall. \n"+"Slowly repeat 4 to 5 times on each leg."
            ),
            Image(
                R.drawable.pose_f,
                R.drawable.yogasix,
                "Yoga Pose Type 6:Sukhasana",
                "Yoga Benefits:Protects your spine and benefits your bone health\n"+"Sukhasana, easy pose, is a simple cross-legged sitting asana in hatha yoga, sometimes used for meditation\n"+"Also known as: Decent pose, Easy pose, Pleasant pose"
            ),
            Image(
                R.drawable.pose_g,
                R.drawable.yogaseven,
                "Yoga Pose Type 7: Adho Mukho Svanasana ",
                "Yoga Benefits:Perfects your posture and prevents cartilage and joint breakdown\n"+"Sit on your heels, stretch your arms forward on the mat and lower your head. Form a table, like pushing your hands, strengthening your legs and slowly raising your hips.\n"+" Press your heels down, let your head hand freely and tighten your waist.\n" +
                        " "
            ),
            Image(
                R.drawable.pose_h,
                R.drawable.yoganine,
                "Yoga Pose Type 9:Baddha konasana",
                "Yoga Benefits:Reduces stress and keeps anxiety and depression at bay\n"+"Sitting on the floor, bend knees and open them out to the side like a book. Join the soles of your feet together while sitting upright.\n" +
                        "\n" +
                        "Place fingertips on the floor directly behind you and lengthen up through the spine. You can also hold onto your ankles and hinge forward at the hips."
            ),
            Image(
                R.drawable.pose_i,
                R.drawable.yogaten,
                "Yoga Pose Type 10:Sukhasna",
                "Yoga Benefits:Builds up stamina in the lungs\n"+"Sit comfortably on the mat with crossed legs (left leg tugged inside the right thigh and right leg tugged inside the left thigh).\n"+
                        "Keep spine straight. Place your hands on your knees.\n"+
                        " Relax your body and breathe gently."
            ),
            Image(
                R.drawable.pose_j,
                R.drawable.yogaeleven,
                "Yoga Pose Type 11:Virabhadrasana I",
                "Yoga Benefits:Helps relieve headaches and removes toxins from body\n"+"Begin standing, then step your right foot forward about four feet. With your foot parallel and toes pointing to the top of the mat, bend your knee into a lunge. ...\n" +
                        "Squeeze your shoulder blades together and downward, and lift your chin to gaze at your hands overhead. Hold your pose and then repeat on the left side.\n"
            ),
            Image(
                R.drawable.pose_k,
                R.drawable.alunomvirom,
                "Alunom Virom Pranayama",
                "Excellent for respiratory issues like asthama and allergies.\n"+
                        "Helps in balancing nervous system "
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imagesList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}
