package com.example.explorandocomponentesjetpack
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.unit.dp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.AlertDialog
import androidx.compose.material.BackdropScaffold
import androidx.compose.material.BackdropValue
import androidx.compose.material.Checkbox
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.IconButton
import androidx.compose.material.RadioButton
import androidx.compose.material.Slider
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.rememberBackdropScaffoldState
import androidx.compose.material3.AssistChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.*
import androidx.constraintlayout.compose.ConstraintLayout
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MostrarPreview() {
    SliderDemo()

@Composable
fun LazyRowDemo() {
    LazyRow {
        items(5) { index ->
            Text(text = "Item #$index", modifier = Modifier.padding(8.dp))
        }
    }
}

}
@Composable
fun LazyColumnDemo() {
    LazyColumn {
        items(5) { index ->
            Text(text = "Item #$index", modifier = Modifier.padding(8.dp))
        }
    }
}
@Composable
fun GridDemo() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        contentPadding = PaddingValues(4.dp)
    ) {
        items(10) { index ->
            Card(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Box(modifier = Modifier.padding(16.dp)) {
                    Text("Item $index")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConstraintLayoutDemo() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (box1, box2) = createRefs()

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
                .constrainAs(box1) {
                    top.linkTo(parent.top, margin = 16.dp)
                    start.linkTo(parent.start, margin = 16.dp)
                }
        )

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
                .constrainAs(box2) {
                    top.linkTo(box1.bottom, margin = 16.dp)
                    start.linkTo(box1.end, margin = 16.dp)
                }
        )
    }
    @Composable
    fun ScaffoldDemo() {
        Scaffold(
            topBar = {
                TopAppBar(title = { Text("Scaffold Demo") })
            },
            floatingActionButton = {
                FloatingActionButton(onClick = {}) {
                    Icon(Icons.Default.Add, contentDescription = "Add")
                }
            },
            content = { padding ->
                Text(
                    "Contenido principal",
                    modifier = Modifier.padding(padding).padding(16.dp)
                )
            }
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldDemo() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Scaffold Demo") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { padding ->
            Text(
                "Contenido principal",
                modifier = Modifier.padding(padding).padding(16.dp)
            )
        }
    )
}
@Composable
fun SurfaceDemo() {
    Surface(
        modifier = Modifier.padding(16.dp),
        color = Color(0xFFBBDEFB),
        shape = RoundedCornerShape(8.dp),
        tonalElevation = 4.dp
    ) {
        Text(
            text = "Este es un Surface",
            modifier = Modifier.padding(16.dp)
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChipDemo() {
    AssistChip(
        onClick = { /* Acción */ },
        label = { Text("Chip de ejemplo") },
        leadingIcon = {
            Icon(Icons.Default.Star, contentDescription = null)
        },
        modifier = Modifier.padding(8.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BackdropScaffoldDemo() {
    val scaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed)
    val scope = rememberCoroutineScope()

    BackdropScaffold(
        scaffoldState = scaffoldState,
        appBar = {
            TopAppBar(
                title = { Text("Backdrop Scaffold") },
                navigationIcon = {
                    IconButton(onClick = {
                        scope.launch {
                            scaffoldState.reveal()
                        }
                    }) {
                        Icon(Icons.Default.Menu, contentDescription = null)
                    }
                }
            )
        },
        backLayerContent = {
            Text("Contenido trasero", modifier = Modifier.padding(16.dp))
        },
        frontLayerContent = {
            Text("Contenido principal", modifier = Modifier.padding(16.dp))
        }
    )
}
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowRowDemo() {
    FlowRow(
        modifier = Modifier.padding(16.dp),
        horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(8.dp),
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(8.dp)
    ) {
        repeat(10) {
            Text(
                text = "Item $it",
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(8.dp)
            )
        }
    }
}
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowColumnDemo() {
    FlowColumn(
        modifier = Modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        repeat(8) {
            Text(
                text = "Elemento $it",
                modifier = Modifier
                    .background(Color(0xFFDCE775))
                    .padding(8.dp)
            )
        }
    }
}
@Composable
fun AlertDialogDemo() {
    var showDialog by remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = { showDialog = true }) {
            Text("Mostrar Diálogo")
        }

        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                title = { Text("Alerta") },
                text = { Text("¿Estás seguro de continuar?") },
                confirmButton = {
                    TextButton(onClick = { showDialog = false }) {
                        Text("Aceptar")
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showDialog = false }) {
                        Text("Cancelar")
                    }
                }
            )
        }
    }
}
@Composable
fun CardDemo() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(8.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Título de la tarjeta", style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text("Este es el contenido de una Card.")
        }
    }
}
@Composable
fun CheckboxDemo() {
    var checked by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it }
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text("Acepto los términos")
    }
}
@Composable
fun FloatingActionButtonDemo() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Acción FAB */ }
            ) {
                Icon(Icons.Default.Add, contentDescription = "Agregar")
            }
        },
        content = { padding ->
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(padding)) {
                Text("Contenido principal", modifier = Modifier.align(Alignment.Center))
            }
        }
    )
}
@Composable
fun IconDemo() {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "Icono de favorito",
            tint = Color.Red,
            modifier = Modifier.size(32.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text("Icono con texto")
    }
}

@Composable
fun ImageDemo() {
    Image(
        painter = painterResource(id = R.drawable.pfp),
        contentDescription = "Imagen local",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(200.dp)
            .clip(RoundedCornerShape(8.dp))
    )
}
@Composable
fun CircularProgressBarDemo() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        CircularProgressIndicator()
    }
}

@Composable
fun RadioButtonDemo() {
    var selectedOption by remember { mutableStateOf("Opción 1") }

    Column(modifier = Modifier.padding(16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = selectedOption == "Opción 1",
                onClick = { selectedOption = "Opción 1" }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Opción 1")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = selectedOption == "Opción 2",
                onClick = { selectedOption = "Opción 2" }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Opción 2")
        }
    }
}
@Composable
fun SliderDemo() {
    var sliderValue by remember { mutableStateOf(0f) }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Valor: ${sliderValue.toInt()}")
        Slider(
            value = sliderValue,
            onValueChange = { sliderValue = it },
            valueRange = 0f..100f,
            steps = 4 // Opcional: define saltos intermedios
        )
    }
}

