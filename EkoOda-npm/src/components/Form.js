import React from 'react'

export default function Form() {
    return (
        <div>
            <form action="signup.html" method="post" id="signup">
            <h1>Reigster new vaccination center</h1>
            <div class="field">
                <label for="name">Name:</label>
                <input type="text" id="form--name" name="form--name" placeholder="Enter vaccination center's name" />
                <small></small>
            </div>
            <div class="field">
                <label for="name">Image link:</label>
                <input type="text" id="form--link" name="form--link" placeholder="Enter vaccination center's image link" />
                <small></small>
            </div>
            <div class="field">
                <label for="name">Description:</label>
                <input type="text" id="form--description" name="form--description" placeholder="Enter vaccination center's description(minimum 6 words)" />
                <small></small>
            </div>
            <div class="field">
                <label for="name">Address:</label>
                <input type="text" id="form-address" name="form-address" placeholder="Enter vaccination center's address" />
                <small></small>
            </div>
            <button type="submit">Reigster</button>
            </form>
        </div>
    )
}
